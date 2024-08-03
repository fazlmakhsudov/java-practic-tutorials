package com.java_basic.les10;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class ValidationMain {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        String fileName = "src/resources/lessons.xml";
        String schemaName = "src/resources/lessons.xsd";

        System.out.println("== Тафтиши эътибории ҳуҷҷати XML бо ёрии класи абстрактии Validator ==");
        boolean isValid = isValidByValidator(fileName, schemaName);
        System.out.println(String.format("FileName '%s' is valid '%b' by Validator", fileName, isValid));
        System.out.println("\n== Тафтиши эътибории ҳуҷҷати XML бо тавассути таҳлили ҳуҷҷати XML (SAXParser) ==");
        isValid = isValidByParsing(fileName, schemaName);
        System.out.println(String.format("FileName '%s' is valid '%b' by Parsing", fileName, isValid));
    }

    public static boolean isValidByValidator(String fileName, String xsd) {
    String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(xsd);
        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
            validator.validate(source);
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public static boolean isValidByParsing(String fileName, String schemaName) {
        Schema schema;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        try {
            schema = factory.newSchema(new File(schemaName));
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setSchema(schema);
            SAXParser parser = spf.newSAXParser();
            parser.parse(fileName, new CustomSAXParser.LessonHandler());
            return true;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }

}
