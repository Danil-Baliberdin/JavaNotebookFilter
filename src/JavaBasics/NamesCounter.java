package JavaBasics;

import java.util.HashMap;

class NamesCounter {
    private final HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {

        if(name.equalsIgnoreCase("")){
            name = "Default";
        }
        if(names.containsKey(name)) {
            Integer oldValue = names.get(name);
            names.remove(name);
            Integer nValue= oldValue+1;
            names.put(name, nValue);

        }
        else {
            names.put(name,1);
        }
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        System.out.println(names);
    }
}

