package JavaBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasportData {
    Map<Integer, String> pasportData = new HashMap<>();
    void addData(Integer num, String fio){
        pasportData.put(num,fio);
    }
    Map<Integer, String> getData(){
        return pasportData;
    }
    void printData(){
        for (var item:pasportData.entrySet()) {
            System.out.println(item.getKey() + " "+item.getValue());
        }
    }

}