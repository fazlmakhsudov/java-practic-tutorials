package com.java_basic.les5;

import java.time.LocalDateTime;
import java.util.Formatter;

public class FormatterMain {

    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        System.out.println(formatter.format("Format '%s' -> '%1$S'", "some word"));

        System.out.println(String.format("Format '%f' -> '%1$.2f'", 23.342535));
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("\ncurrentDateTime - " + currentDateTime);
        String parseDateTime = String.format("Current dateTime after formatting -> day - %td, month - %1$tm, " +
                "year - %1$tY, hour - %1$tH, minute - %1$tM, second - %1$tS",currentDateTime);
        System.out.println(parseDateTime);
    }
}
