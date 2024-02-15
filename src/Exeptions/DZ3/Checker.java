package Exeptions.DZ3;

public class Checker {
    public boolean isOnlyLetter(String text){
        char[] charArray = text.toCharArray();
        for (char chr:charArray) {
            if(!Character.isLetter(chr)){
                return false;
            }
        }
        return true;
    }
    public boolean isOnlyDigit(String text){
        char[] charArray = text.toCharArray();
        for (char chr:charArray) {
            if(!Character.isDigit(chr)){
                return false;
            }
        }
        return true;
    }
    public boolean hasPunctuations(String date){

        return date.contains(".") || date.contains(",") || date.contains("/");
    }
}
