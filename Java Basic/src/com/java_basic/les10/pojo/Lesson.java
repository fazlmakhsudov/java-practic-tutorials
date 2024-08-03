package com.java_basic.les10.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Lesson {

    @XmlElement(required = true)
    String title;

    @XmlElement(required = true)
    String course;

    @XmlElement
    Topic scope;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Topic getScope() {
        return scope;
    }

    public void setScope(Topic scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("title = '" + title + '\'').append(System.lineSeparator())
                .append("course = '" + course + '\'').append(System.lineSeparator())
                .append("scope = '[").append(System.lineSeparator())
                .append(scope);
        sb.append("]'").append(System.lineSeparator());
        return sb.toString();
    }
}
