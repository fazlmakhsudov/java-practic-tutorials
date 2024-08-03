package com.java_basic.les10;

import com.java_basic.les10.pojo.Lessons;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CustomUnmarshaller {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        //эҷоди контексти JAXB
        JAXBContext jaxbContext = JAXBContext.newInstance(Lessons.class);
        //эҷоди объекти Unmarshaller
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        // эҷод ва муқаррар кардани арзишҳо дар класҳои POJO
        Lessons lessons = (Lessons) jaxbUnmarshaller.unmarshal(new FileInputStream("src/resources/lessons.xml"));

        System.out.println(lessons);
    }
}
