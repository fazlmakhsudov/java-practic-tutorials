package com.java_basic.les10;

import com.java_basic.les10.pojo.Lesson;
import com.java_basic.les10.pojo.Lessons;
import com.java_basic.les10.pojo.Topic;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomSAXParser {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        javax.xml.parsers.SAXParser saxParser = factory.newSAXParser();
        LessonHandler handler = new LessonHandler();

        saxParser.parse("src/resources/lessons.xml", handler);

        Lessons document = handler.getRoot();

        System.out.println(document);
    }

    static class LessonHandler extends DefaultHandler {

        private static final String LESSONS = "lessons";
        private static final String LESSON = "lesson";
        private static final String COURSE = "course";
        private static final String TITLE = "title";
        private static final String TOPIC = "topic";
        private static final String SCOPE = "scope";

        private Lessons root;
        private StringBuilder elementValue;

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if (elementValue == null) {
                elementValue = new StringBuilder();
            } else {
                elementValue.append(ch, start, length);
            }
        }

        @Override
        public void startDocument() throws SAXException {
            root = new Lessons();
        }

        @Override
        public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException {
            switch (qName) {
                case LESSONS:
                    root.setLessonList(new ArrayList<>());
                    break;
                case LESSON:
                    root.getLessons().add(new Lesson());
                    break;
                case COURSE:
                    elementValue = new StringBuilder();
                    break;
                case TITLE:
                    elementValue = new StringBuilder();
                    break;
                case SCOPE:
                    latestLesson().setScope(new Topic());
                    break;
                case TOPIC:
                    elementValue = new StringBuilder();
                    break;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            switch (qName) {
                case TITLE:
                    latestLesson().setTitle(elementValue.toString());
                    break;
                case COURSE:
                    latestLesson().setCourse(elementValue.toString());
                    break;
                case TOPIC:
                    latestLesson().getScope().getTopics().add(elementValue.toString());
            }
        }

        private Lesson latestLesson() {
            List<Lesson> lessons = this.root.getLessons();
            int latestLessonIndex = lessons.size() - 1;
            return lessons.get(latestLessonIndex);
        }

        public Lessons getRoot() {
            return root;
        }

    }
}