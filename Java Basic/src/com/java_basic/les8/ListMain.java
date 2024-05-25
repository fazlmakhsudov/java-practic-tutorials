package com.java_basic.les8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListMain {

    public static void main(String[] args) {

        // Мисоли 1
        ArrayList<String> listObject1 = new ArrayList<>();

        System.out.println("Илова кардани элемент ба listObject1: " + listObject1.add("Як")); // элементро ба думи рӯйхат илова кардан
        listObject1.add("Ду");
        listObject1.add("Се");
        listObject1.add("Чор");

        System.out.println("Элементро аз рӯи индекс 0 дарёфт кардан: " + listObject1.get(0)); // элементро аз рӯи индекс дарёфт кардан
        System.out.println("Элементро аз рӯи индекс 1 дарёфт кардан: " + listObject1.get(1));
        System.out.println("Элементро аз рӯи индекс 2 дарёфт кардан: " + listObject1.get(2));
        System.out.println("Элементро аз рӯи индекс 3 дарёфт кардан: " + listObject1.get(3));

        System.out.println("Андозаи рӯйхати listObject1: " + listObject1.size()); // андозаи рӯйхатро гирифтан

        System.out.println("Элемент аз рӯи индекси 2 хориҷ карда мешавад: " + listObject1.remove(2));  // элементро аз рӯи индекс хориҷ кардан
        System.out.println("Элемент аз рӯи арзиш хориҷ карда мешавад: " + listObject1.remove("Ду")); // элементро аз рӯи арзиш хориҷ кардан

        listObject1.add(0, "Панч"); // элементро ба мавқеи муайян илова кардан

        Iterator<String> iterator = listObject1.iterator();
        while (iterator.hasNext()) {
            System.out.println("listObject1.iterator().next() -> " + iterator.next());
        }

        // Мисоли 2
        LinkedList<String> listObject2 = new LinkedList<>();

        System.out.println("\nИлова кардани элемент ба listObject2: " + listObject2.add("Ду"));

        listObject2.addFirst("Як");

        listObject2.addLast("Чор");

        listObject2.add(2, "Се");

        System.out.println("Андозаи рӯйхати listObject2: " + listObject2.size());

        for (String element : listObject2) {
            System.out.println("foreach listObject2: " + element);
        }

        listObject2.addAll(listObject1); //ҳамаи элементҳои listObject1-ро ба listObject2 илова кардан

        iterator = listObject2.descendingIterator(); // итераторро бо тартиби баръакс баргардондан
        while(iterator.hasNext()) {
            System.out.println("listObject2.listIterator().next() -> " + iterator.next());
        }

        System.out.println("listObject2 дорои ҳамаи элементҳои listObject1 мебошад: " + listObject2.containsAll(listObject1));
        System.out.println("listObject1 дорои ҳамаи элементҳои listObject2 мебошад: " + listObject1.containsAll(listObject2));

        listObject2.retainAll(listObject1);
        System.out.println("Пас аз даъват кардани усули retain()");
        for (String element : listObject2) {
            System.out.println("foreach listObject2: " + element);
        }
    }
}
