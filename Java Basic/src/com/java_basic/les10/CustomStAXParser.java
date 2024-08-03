package com.java_basic.les10;

import javax.xml.XMLConstants;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomStAXParser {

    public static void main(String[] args) {

        try {

            printXmlByXmlCursorReader(Paths.get("src/resources/lessons.xml"));

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }

    }

    private static void printXmlByXmlCursorReader(Path path)
            throws FileNotFoundException, XMLStreamException {

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

        xmlInputFactory.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        xmlInputFactory.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");

        XMLStreamReader reader = xmlInputFactory.createXMLStreamReader(
                new FileInputStream(path.toFile()));

        int eventType = reader.getEventType();
        String shift = "";
        while (reader.hasNext()) {

            eventType = reader.next();

            if (eventType == XMLEvent.START_ELEMENT) {
                switch (reader.getName().getLocalPart()) {
                    case "lessons":
                        System.out.printf("lessons%n---------------------------%n");
                        break;
                    case "lesson":
                        shift = "  ";
                        System.out.printf("%slesson%n", shift);
                        break;
                    case "title":
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("%s  title = %s%n", shift, reader.getText());
                        }
                        break;
                    case "course":
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("%s  course = %s%n", shift, reader.getText());
                        }
                        break;
                    case "scope":
                        System.out.printf("%s  scope = [%n", shift);
                        break;
                    case "topic":
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("%s            topic = %s%n", shift, reader.getText());
                        }
                        break;
                }

            }

            if (eventType == XMLEvent.END_ELEMENT) {
                switch (reader.getName().getLocalPart()) {
                    case "lessons":
                        shift = "";
                        break;
                    case "lesson":
                        shift = "";
                        System.out.println("--------------------------");
                        break;
                    case "title":
                        break;
                    case "course":
                        break;
                    case "topic":
                        break;
                    case "scope":
                        System.out.printf("%s  ]%n", shift);
                        break;
                }
            }

        }

    }
}
