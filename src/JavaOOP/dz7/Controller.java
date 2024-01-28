package JavaOOP.dz7;


import java.util.logging.Logger;

public class Controller {
    Logger logger;
    View view;
    CaclulatorModel caclulatorModel;
    public Controller (View view,CaclulatorModel caclulatorModel, Logger logger){
        this.view = view;
        this.caclulatorModel = caclulatorModel;
        this.logger = logger;
    }

    public void workButton() {
        logger.info("Логирование в момент использования контроллера");
        while (true) {
            view.showMenu();
            String userChoice = view.getInfo();
            if(!userChoice.equalsIgnoreCase("1")&&!userChoice.equalsIgnoreCase("2")&&!userChoice.equalsIgnoreCase("3")) break;
            view.showToUser("Введите пожалуйста комплексноe число №1");
            view.showToUser("((Действительная часть) ПРОБЕЛ (Мнимая часть))");
            view.showToUser("Пример: (-21 -34i)");
            double[] firstNumber = caclulatorModel.makeNumbers(view.getInfo());
            view.showToUser("Введите пожалуйста комплексное число №2");
            view.showToUser("((Действительная часть) ПРОБЕЛ (Мнимая часть))");
            view.showToUser("Пример: (-21 -34i)");
            double[] seconndNumber = caclulatorModel.makeNumbers(view.getInfo());
            if (userChoice.equalsIgnoreCase("1")) {
                double[] answer = caclulatorModel.addition(firstNumber,seconndNumber);
                view.printAnswer(answer);
            }
            else if (userChoice.equalsIgnoreCase("2")) {
                double[] answer = caclulatorModel.substraction(firstNumber,seconndNumber);
                view.printAnswer(answer);
            }
            else if (userChoice.equalsIgnoreCase("3")) {
                double[] answer = caclulatorModel.multiply(firstNumber,seconndNumber);
                view.printAnswer(answer);
            }
        }
    }
}