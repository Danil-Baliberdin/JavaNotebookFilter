package JavaOOP.dz7;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleView implements View{
    Scanner scn = new Scanner(System.in);
    @Override
    public void showMenu() {
        System.out.println("================================");
        System.out.println("Выберите нужное действие:");
        System.out.println("1)Сложение ");
        System.out.println("2)Вычитание ");
        System.out.println("3)Умножение");
        System.out.println("4)Выйти");
        System.out.println("================================");
    }

    @Override
    public void showToUser(String text) {
        System.out.println(text);
    }

    @Override
    public String getInfo() {
        return scn.nextLine();
    }
    public void printAnswer(double[] array) {

        if (array[0] == 0 && array[1] == 0) {
            System.out.println("Ответ = 0");
        } else if (array[1] == 0) {
            System.out.println(String.format("Ответ = %d", (int) array[0]));
        } else if (array[0] == 0) {
            System.out.println(String.format("Ответ = %di", (int)array[1]));
        }
        else {
            if (array[1]>0){
                System.out.println(String.format("Ответ = %d+%di",(int)array[0],(int)array[1]));
            }
            else if (array[1]<0){
                System.out.println(String.format("Ответ = %d%di",(int)array[0],(int)array[1]));
            }
        }

    }
}
