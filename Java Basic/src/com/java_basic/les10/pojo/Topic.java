package com.java_basic.les10.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class Topic {

    @XmlElement(name="topic")
    List<String> topics = new ArrayList<>();

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String topic : topics) {
            sb
                    .append("           ")
                    .append(topic)
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }
}
