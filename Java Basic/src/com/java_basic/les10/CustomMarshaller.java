package com.java_basic.les10;

import com.java_basic.les10.pojo.Lesson;
import com.java_basic.les10.pojo.Lessons;
import com.java_basic.les10.pojo.Topic;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CustomMarshaller {

    public static void main(String[] args) {
        try{
            //эҷоди контексти JAXB
            JAXBContext jContext = JAXBContext.newInstance(Lessons.class);
            //эҷоди объекти marshaller
            Marshaller marshallObj = jContext.createMarshaller();
            //танзим кардани амвол барои нишон додани баромади формати xml
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //муқаррар кардани арзишҳо дар класҳои POJO
            Lessons lessons = createLessons();
            //усули Маршаллро даъват кардан
            String path = "src/resources/javaToXml.xml";
            marshallObj.marshal(lessons, new FileOutputStream(path));
            System.out.println("File is created: " + Files.exists(Paths.get(path)));

        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static Lessons createLessons() {
        Lessons lessons = new Lessons();
        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(createLesson("Marshalling in Java"));
        lessonList.add(createLesson("Unmarshalling in Java"));
        lessons.setLessonList(lessonList);
        return lessons;
    }

    private static Lesson createLesson(String title) {
        Lesson lesson = new Lesson();
        lesson.setCourse("Java Basic");
        lesson.setTitle(title);
        List<String> topics = new ArrayList<>();
        topics.add(title + ": Topic 1");
        topics.add(title + ": Topic 2");
        topics.add(title + ": Topic 3");
        Topic scope = new Topic();
        scope.setTopics(topics);
        lesson.setScope(scope);
        return lesson;
    }
}
