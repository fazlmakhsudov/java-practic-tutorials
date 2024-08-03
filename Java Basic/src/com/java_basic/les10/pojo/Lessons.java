package com.java_basic.les10.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Lessons {

    @XmlElement(name="lesson")
    List<Lesson> lessonList;

    public List<Lesson> getLessons() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Lesson lesson : lessonList) {
            sb.append(lesson)
                    .append(System.lineSeparator())
                    .append("----------------------")
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }
}
