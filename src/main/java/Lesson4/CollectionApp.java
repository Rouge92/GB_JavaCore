package Lesson4;

import java.util.*;

public class CollectionApp {
    public static void main(String args[]) {
        List<String> words = Arrays.asList("Hedgehog", "Table", "Cat", "Window", "Hedgehog", "Coffee",
                "Dog", "Donut", "Hedgehog", "Donut", "Donut", "Window");

        Iterator<String> iter = words.iterator();

        Set<String> counts = new HashSet<String>(words);
        System.out.println("Список уникальных слов в коллекции:");
        for (String temp : counts) {
            if (Collections.frequency(words, temp) == 1)
                System.out.println(temp);
        }
        System.out.println("----------------------------------------------");
        for (String temp : counts) {
            if (Collections.frequency(words, temp) != 1)
                System.out.println(temp + ": встречается " + Collections.frequency(words, temp) + " раз.");
        }
        System.out.println("----------------------------------------------");

        Phonebook phoneBook = new Phonebook();
        Phonebook.add("Holmes","+71111111111");
        Phonebook.add("Watson","+72222222222");
        Phonebook.add("Hudson","+73333333333");
        Phonebook.add("Holmes","+7444444444");
        Phonebook.add("Lestrade","+755555555");

        System.out.println(phoneBook.get("Holmes"));
    }
}