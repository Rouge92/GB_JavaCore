package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void add(String name, String phone){
        ArrayList<String> phones = phoneBook.get(name);
        if (phones == null) phones = new ArrayList<>();
        phones.add(phone);
        phoneBook.put(name, phones);
    }
    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }
}
