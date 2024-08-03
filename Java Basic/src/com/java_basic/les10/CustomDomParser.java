package com.java_basic.les10;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class CustomDomParser {

    public static void main(String[] args) {
        printXmlDocument("lessons.xml");
    }

    public static void printXmlDocument(String fileName) {
        Document doc = getDocument(fileName);
        if (!doc.hasChildNodes()) {
            System.out.println("Маълумот нест");
        }
        System.out.println(doc.getFirstChild().getNodeName() + " ->");
        NodeList list = doc.getChildNodes();
        for (int i = 0; i < list.getLength(); i++) {
            printXmlNode(list.item(i), "  ");
        }
    }

    private static void printXmlNode(Node node, String shiftOut) {
        NodeList nodeList = node.getChildNodes();
        int n = nodeList.getLength();
        Node current;
        for (int i=0; i < n; i++) {
            current = nodeList.item(i);
            if(current.getNodeType() == Node.ELEMENT_NODE) {
                if (current.hasChildNodes()) {
                    System.out.println(shiftOut + current.getNodeName() + " -> ");
                    printXmlNode(current, shiftOut + "  ");
                }
            } else if (current.getNodeValue() != null
                    && !current.getNodeValue().matches("[ ]*\n[ ]*"))
            {
                System.out.println(shiftOut + current.getNodeName() + " : " + current.getNodeValue() );
            }
        }
    }

    public static Document getDocument(String fileName) {
        DocumentBuilder builder;
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(new File("src/resources/" + fileName));
            doc.getDocumentElement().normalize();
            return doc;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}
