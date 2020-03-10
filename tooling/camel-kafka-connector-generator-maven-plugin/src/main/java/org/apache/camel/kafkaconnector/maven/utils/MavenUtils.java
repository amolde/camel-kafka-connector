/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.maven.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

import freemarker.cache.URLTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.IOUtils;
import org.apache.maven.plugin.logging.Log;

public final class MavenUtils {

    private MavenUtils() {

    }

    public static void addExclusionsToDependency(Document pom, String targetDependency, Set<String> colonSeparatedDependeciesToExclude, String generatedSectionStartMarker, String generatedSectionStopMarker) throws XPathExpressionException {
        XPath xpath = XPathFactory.newInstance().newXPath();
        Node dependency = ((NodeList) xpath.compile("/project/dependencies/dependency[artifactId/text() = '" + targetDependency + "']").evaluate(pom, XPathConstants.NODESET)).item(0);

        Element exclusions = pom.createElement("exclusions");

        dependency.appendChild(pom.createComment(generatedSectionStartMarker));
        dependency.appendChild(exclusions);
        dependency.appendChild(pom.createComment(generatedSectionStopMarker));

        for (String dep : colonSeparatedDependeciesToExclude) {
            String[] tokens = dep.split("\\:");
            String groupIdStr = tokens[0];
            String artifactIdStr = tokens[1];

            Element exclusion = pom.createElement("exclusion");

            Element groupId = pom.createElement("groupId");
            groupId.setTextContent(groupIdStr);
            exclusion.appendChild(groupId);

            Element artifactId = pom.createElement("artifactId");
            artifactId.setTextContent(artifactIdStr);
            exclusion.appendChild(artifactId);

            exclusions.appendChild(exclusion);
        }
    }

    public static String removeGeneratedSections(String pom, String generatedSectionStartMarker, String generatedSectionStopMarker, int maxNumberOfOccurrences) {
        if (maxNumberOfOccurrences > 0 && pom.contains(generatedSectionStartMarker)) {
            int start = pom.indexOf(generatedSectionStartMarker);
            int end = pom.indexOf(generatedSectionStopMarker);
            if (end <= start) {
                throw new IllegalArgumentException("Generated sections inside the xml document are not well-formed");
            }

            String newPom = pom.substring(0, start) + pom.substring(end + generatedSectionStopMarker.length());
            return removeGeneratedSections(newPom, generatedSectionStartMarker, generatedSectionStopMarker, maxNumberOfOccurrences - 1);
        }

        return pom;
    }

    public static void writeFileIfChanged(String newContent, File file, Log log) throws IOException {
        boolean write = true;
        file = file.getCanonicalFile();
        if (file.exists()) {
            try (FileReader fr = new FileReader(file)) {
                String oldContent = IOUtils.toString(fr);
                if (!newContent.equals(oldContent)) {
                    log.debug("Writing new file " + file.getAbsolutePath());
                    fr.close();
                } else {
                    log.debug("File " + file.getAbsolutePath() + " has been left unchanged");
                    write = false;
                }
            }
        } else {
            // Create the structure
            File parent = file.getParentFile();
            parent.mkdirs();
        }

        if (write) {
            try (FileWriter fw = new FileWriter(file)) {
                IOUtils.write(newContent, fw);
            }
        }
    }

    public static void writeXmlFormatted(Document pom, File destination, Log log) throws Exception {
        XPathExpression xpath = XPathFactory.newInstance().newXPath().compile("//text()[normalize-space(.) = '']");
        NodeList emptyNodes = (NodeList) xpath.evaluate(pom, XPathConstants.NODESET);

        // Remove empty text nodes
        for (int i = 0; i < emptyNodes.getLength(); i++) {
            Node emptyNode = emptyNodes.item(i);
            emptyNode.getParentNode().removeChild(emptyNode);
        }

        pom.setXmlStandalone(true);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformerFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, Boolean.TRUE);
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        DOMSource source = new DOMSource(pom);

        String content;
        try (StringWriter out = new StringWriter()) {
            StreamResult result = new StreamResult(out);
            transformer.transform(source, result);
            content = out.toString();
        }

        // Fix header formatting problem
        content = content.replaceFirst("-->", "-->\n").replaceFirst("\\?><!--", "\\?>\n<!--");

        writeFileIfChanged(content, destination, log);
    }

    public static void addDependencies(Document pom, Set<String> deps, String generatedSectionStartMarker, String generatedSectionStopMarker) throws XPathExpressionException {
        XPath xpath = XPathFactory.newInstance().newXPath();
        Node dependencies = ((NodeList) xpath.compile("/project/dependencies").evaluate(pom, XPathConstants.NODESET)).item(0);

        if (deps.size() > 0) {
            dependencies.appendChild(pom.createComment(generatedSectionStartMarker));
            for (String dep : deps) {
                Element dependency = pom.createElement("dependency");
                dependencies.appendChild(dependency);

                String[] comps = dep.split("\\:");
                String groupIdStr = comps[0];
                String artifactIdStr = comps[1];
                String versionStr = comps.length > 2 ? comps[2] : null;

                Element groupId = pom.createElement("groupId");
                groupId.setTextContent(groupIdStr);
                dependency.appendChild(groupId);

                Element artifactId = pom.createElement("artifactId");
                artifactId.setTextContent(artifactIdStr);
                dependency.appendChild(artifactId);

                if (versionStr != null) {
                    Element version = pom.createElement("version");
                    version.setTextContent(versionStr);
                    dependency.appendChild(version);
                }

            }
            dependencies.appendChild(pom.createComment(generatedSectionStopMarker));
        }
    }

    public static <T> Stream<T> concat(Stream<T> s1, Stream<T> s2, Stream<T> s3) {
        return Stream.concat(s1, Stream.concat(s2, s3));
    }

    public static Document createCrateXmlDocumentFromTemplate(Template template, Map<String, String> props) throws IOException, TemplateException, ParserConfigurationException, SAXException {
        StringWriter sw = new StringWriter();
        template.process(props, sw);

        String xml = sw.toString();
        ByteArrayInputStream bin = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        return builder.parse(bin);
    }

//    public static Template getTemplate(String name) throws IOException {
//        Configuration cfg = new Configuration(Configuration.getVersion());
//
//        cfg.setTemplateLoader(new URLTemplateLoader() {
//            @Override
//            protected URL getURL(String name) {
//                return CamelKafkaConnectorUpdateMojo.class.getResource("/" + name);
//            }
//        });
//
//        cfg.setDefaultEncoding("UTF-8");
//        Template template = cfg.getTemplate(name);
//        return template;
//    }

    public static Template getTemplate(File templateFile) throws IOException {
        Configuration cfg = new Configuration(Configuration.getVersion());

        cfg.setTemplateLoader(new URLTemplateLoader() {
            @Override
            protected URL getURL(String name) {
                try {
                    return new URL(name);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        });

        cfg.setDefaultEncoding("UTF-8");
        cfg.setLocalizedLookup(false);
        Template template = cfg.getTemplate(templateFile.toURI().toURL().toExternalForm());
        return template;
    }

    public static Set<String> csvToSet(String csv) {
        if (csv == null || csv.trim().length() == 0) {
            return new TreeSet<>();
        }

        Set<String> set = new TreeSet<>();
        for (String s : csv.split(",")) {
            set.add(s.trim());
        }
        return set;
    }
}
