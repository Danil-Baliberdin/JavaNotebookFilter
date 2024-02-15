package Exeptions.SecondSeminaar;

public class TryCatch {
    public static String expr(char a) throws Exception {
// Введите свое решение ниже
        if (String.valueOf(a).equals(" ")){
            throw new Exception("Пустая строка введена.");

        }
        else{
            System.out.println(String.format("Ваш ввод - [%s]",String.valueOf(a)));
            return String.valueOf(a);
        }
    }

}
