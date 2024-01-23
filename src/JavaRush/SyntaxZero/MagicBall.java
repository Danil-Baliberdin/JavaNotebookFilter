package JavaRush.SyntaxZero;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {
     private Map<Integer,String> answers = new HashMap<>();

    public void getPredictious(){
        Random random = new Random();
        Integer faith = random.nextInt(1,8);
        System.out.println(answers.get(faith));
    }

    public void fillAnswers(){
        for (int i = 0; i < 7; i++) {
            answers.put((i+1),("ответ под номером "+(i+1)));
        }
    }
}
// Client code
//    Scanner scanner = new Scanner(System.in);
//    MagicBall ball = new MagicBall();
//        ball.fillAnswers();
//                System.out.print("Задайте ваш вопрос: ");
//                scanner.nextLine();
//                ball.getPredictious();