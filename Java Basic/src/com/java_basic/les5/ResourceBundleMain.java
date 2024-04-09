package com.java_basic.les5;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleMain {

    public static void main(String[] args) throws UnsupportedEncodingException {
        ResourceBundle vocabularyBundleDefault = ResourceBundle.getBundle("vocabulary");
        ResourceBundle vocabularyBundleEnglish = ResourceBundle.getBundle("vocabulary", Locale.ENGLISH);
        ResourceBundle vocabularyBundleTajik = ResourceBundle.getBundle("vocabulary", Locale.forLanguageTag("tj"));

        String vocabularyKey1 = "first_name";
        String vocabularyKey2 = "last_name";
        String vocabularyKey3 = "age";
        String vocabularyKey4 = "message";

        // Мисоли 1
        System.out.println("== Vocabulary bundle ==");

        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'",
                vocabularyBundleDefault.getLocale(), vocabularyKey1, vocabularyBundleDefault.getString(vocabularyKey1)));
        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'",
                vocabularyBundleEnglish.getLocale(), vocabularyKey1, vocabularyBundleEnglish.getString(vocabularyKey1)));
        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'\n",
                vocabularyBundleTajik.getLocale(), vocabularyKey1, vocabularyBundleTajik.getString(vocabularyKey1)));

        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'",
                vocabularyBundleDefault.getLocale(), vocabularyKey2, vocabularyBundleDefault.getString(vocabularyKey2)));
        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'",
                vocabularyBundleEnglish.getLocale(), vocabularyKey2, vocabularyBundleEnglish.getString(vocabularyKey2)));
        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'\n",
                vocabularyBundleTajik.getLocale(), vocabularyKey2, vocabularyBundleTajik.getString(vocabularyKey2)));

        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'",
                vocabularyBundleDefault.getLocale(), vocabularyKey3, vocabularyBundleDefault.getString(vocabularyKey3)));
        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'",
                vocabularyBundleEnglish.getLocale(), vocabularyKey3, vocabularyBundleEnglish.getString(vocabularyKey3)));
        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'\n",
                vocabularyBundleTajik.getLocale(), vocabularyKey3, vocabularyBundleTajik.getString(vocabularyKey3)));

        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'",
                vocabularyBundleDefault.getLocale(), vocabularyKey4, vocabularyBundleDefault.getString(vocabularyKey4)));
        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'",
                vocabularyBundleEnglish.getLocale(), vocabularyKey4, vocabularyBundleEnglish.getString(vocabularyKey4)));
        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'\n",
                vocabularyBundleTajik.getLocale(), vocabularyKey4, vocabularyBundleTajik.getString(vocabularyKey4)));

        // Мисоли 2
        ResourceBundle libraryBundle = ResourceBundle.getBundle("library");
        ResourceBundle libraryBundleEnglish = ResourceBundle.getBundle("library", Locale.ENGLISH);
        ResourceBundle libraryBundleTajik = ResourceBundle.getBundle("library", Locale.forLanguageTag("tj"));

        String libraryKey1 = "class";
        String libraryKey2 = "conduct";
        String libraryKey3 = "hello";
        String libraryKey4 = "lesson";

        System.out.println("== Library bundle ==");

        System.out.println(String.format("\nlocale - '%s', key - '%s', value - '%s'",
                libraryBundle.getLocale(), libraryKey1, libraryBundle.getString(libraryKey1)));
        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'",
                libraryBundleEnglish.getLocale(), libraryKey1, libraryBundleEnglish.getString(libraryKey1)));
        System.out.println(String.format("locale - '%s', key - '%s', value - '%s'",
                libraryBundleTajik.getLocale(), libraryKey1, libraryBundleTajik.getString(libraryKey1)));
    }
}
