package JavaBasics;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
     public static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

        if(phoneBook.containsKey(name)){
        ArrayList<Integer> currentName = phoneBook.get(name);
        currentName.add(phoneNum);
        phoneBook.replace(name , currentName);
    }
    else
    {
        ArrayList<Integer> currentName = new ArrayList<Integer>();
        currentName.add(phoneNum);
        phoneBook.put(name,currentName);
    }
// Введите свое решение ниже
    }

    public ArrayList<Integer> find(String name) {
        if(!phoneBook.containsKey(name)) {
            ArrayList < Integer > emptyLine = new ArrayList<Integer>();
            return emptyLine;
        }
            return phoneBook.get(name);
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
