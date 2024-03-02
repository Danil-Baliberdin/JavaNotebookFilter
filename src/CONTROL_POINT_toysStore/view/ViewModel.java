package CONTROL_POINT_toysStore.view;

import CONTROL_POINT_toysStore.data.Toy;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewModel {
    Scanner scn = new Scanner(System.in);
    public void greeting(){
        System.out.println("Добрый день, 1 попытка стоит 250 рублейn\n" +
                "Сколько раз вы хотите попробовать?");
    }
    public void menu(){
        System.out.println("Выберите пожалуйста нужное действие\n" +
                "1)Выбрать номер игрушки для розыгрыша\n" +
                "2)Закончить играть");
    }
    public void win(){
        System.out.println("Поздравляю вы выйграли");
    }
    public void superPrize(){
        System.out.println("Поздавляем вы выграли супер приз и забираете все оставшиеся в лототроне игрушки");
    }
    public void loose(){
        System.out.println("Не расстраивайесь, в следующий раз повезет");
    }
    public void showToys(ArrayList<Toy> lototrone){
        for (Toy toy:lototrone) {
            System.out.printf("Игрушка под номером %d - %s%n",lototrone.indexOf(toy)+1, toy.toString() );
        }
    }
    public int getInfo(){
        System.out.println("Введите ваш выбор: ");
        return scn.nextInt();
    }
    public void ending(ArrayList<Toy> prize, int tryCounter){
        int lostMoney = tryCounter * 250;
        int wonMoney = 0;
        if(prize.size()!=0){
            for (Toy toy:prize) {
                wonMoney += toy.getPrice();
            }
            System.out.println(String.format("Вы потратили на попытки %d\n" +
                    "Общая стоимость выйгранных игрушек %d",lostMoney,wonMoney));
            for (Toy toy:prize) {
                System.out.println(String.format("Вы выйграли %s",toy.toString()));
            }
        }else {
            System.out.println(String.format("Вы потратили на попытки %d",lostMoney));
            loose();
        }
    }
}
