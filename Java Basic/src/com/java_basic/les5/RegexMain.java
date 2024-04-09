package com.java_basic.les5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

    public static void main(String[] args) {
        // Мисоли 1
        System.out.println("== regex1 - 'ab' ==");
        String text1 = "This text is about to find ab in the text where 'ab' presents";
        String regex1 = "ab";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(text1);

        while (matcher1.find()) {
            System.out.println(String.format("found - '%s', start index - %d", matcher1.group(), matcher1.start()));
        }

        // Мисоли 2
        System.out.println("\n== regex2 - '([a-z]{4,6})(\\s)' ==");
        String text2 = "This text is about to fInd ab in the tExt where ab presents";
        String regex2 = "([a-z]{4,6})(\\s)";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2= pattern2.matcher(text2);

        while (matcher2.find()) {
            System.out.println(String.format("found - '%s', start index - %d", matcher2.group(1), matcher2.start()));
        }

        // Мисоли 3
        System.out.println("\n== regex3 - '[A-Z][A-Za-z]{4}[0-9]{1,2}[@][.]company' ==");
        String regex3 = "[A-Z][A-Za-z]{4}[0-9]{1,2}[@][.]company";
        String password1 = "Fabcd46@.company";
        String password2 = "LEFgh4@.company";
        String password3 = "Fabc46@.company";
        String password4 = "lEFgh4@.company";

        System.out.println(String.format("Password '%s' matches with regex '%s' - %b", password1, regex3,
                password1.matches(regex3)));
        System.out.println(String.format("Password '%s' matches with regex '%s' - %b", password2, regex3,
                password2.matches(regex3)));
        System.out.println(String.format("Password '%s' matches with regex '%s' - %b", password3, regex3,
                password3.matches(regex3)));
        System.out.println(String.format("Password '%s' matches with regex '%s' - %b", password4, regex3,
                password4.matches(regex3)));

    }
}
