package Exeptions.DZ3;

import JavaBasics.PasportData;
import JavaOOP.dz7.StringRedactor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    private  static ArrayList<String> allInfo = new ArrayList<>();
    private String[] tempArray = new String[6];
    public Parser(){
    }
    public String[] getTempArray(){
        return tempArray;
    }
    public ArrayList<String> getAllInfo(){
        return allInfo;
    }
    public void setAllInfo(String value){
        this.allInfo.add(value);
    }
    public void parsePhoneNumber(String number) throws IOException{
        if(number.length()==11){
            this.tempArray[4] = number;
        }else throw new IOException();
    }
    public void parseGender(String gender) throws IOException{
        if(gender.equalsIgnoreCase("f")||gender.equalsIgnoreCase("m")){
            this.tempArray[5] = gender;
        }else throw new IOException();
    }
    public void dateParser(String date)throws IOException{
        if (date.contains(",") || date.contains("/")){
            throw new IOException();
        }
        String[] array = date.split("\\.");
        if(array.length!=3) {
            throw new IOException();
        }else if(Integer.parseInt(array[0])<1||Integer.parseInt(array[0])>31){
            throw new IOException();
        } else if (Integer.parseInt(array[1])<1||Integer.parseInt(array[1])>12) {
            throw new IOException();
        }else if(Integer.parseInt(array[2])<1920||Integer.parseInt(array[2])>2024) {
            throw new IOException();
        }else this.tempArray[3]=date;
    }
    public void parseName(String name){
        if(tempArray[0]==null){
            this.tempArray[0] = name;
        }else if(tempArray[1]==null){
            this.tempArray[1] = name;
        }else tempArray[2]= name;
    }









}
