package JavaOOP.Lection5Tasks.Second;

import java.util.Scanner;

public class View {
    Scanner scn = new Scanner(System.in);

    public void showMenu(){
        System.out.println("Выберите нужный вам вариант:\n1 - Добавить контакт \n2 - удалить контакт \n3 - Показать контакт \n4- - Обновить информацию о контакте\n5 - Если хотите выйти введите  - quit ");
    }

    public String getInfo(){
        return scn.nextLine().toLowerCase();
    }
    public String gimmeName(){
        System.out.println("Введите имя");
        return getInfo();
    }
    public String gimmeNumber(){
        System.out.println("Введите номер телефона");
        return getInfo();
    }

}
