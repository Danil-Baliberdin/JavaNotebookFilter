package JavaOOP.dz5;

import java.util.Scanner;

public class View {
    Scanner scn = new Scanner(System.in);
    public int usersChoice(){
        System.out.println("Введите нужный вариант");
        return scn.nextInt();
    }
}
