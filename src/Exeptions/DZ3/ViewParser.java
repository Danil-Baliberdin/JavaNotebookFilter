package Exeptions.DZ3;

import java.util.Scanner;

public class ViewParser {
    Scanner scanner = new Scanner(System.in);
    public void showGreeting(){
        System.out.println("Введите данные через пробел(ФИО,дату рождения, номер телефона и пол)");
    }
    public String getInput(){
        return scanner.nextLine();
    }

}
