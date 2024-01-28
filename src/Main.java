
import JavaOOP.dz5.Controllerr;
import JavaOOP.dz5.StudyGroupService;
import JavaOOP.dz5.View;
import JavaOOP.dz6.firstTaskRefactor.Box;
import JavaOOP.dz6.firstTaskRefactor.Printer;
import JavaOOP.dz7.CaclulatorModel;
import JavaOOP.dz7.ConsoleView;
import JavaOOP.dz7.Controller;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Main {
    public static void main(String[] args) {
//        Box<Integer> box = new Box<>(1231);                    //dz 6  - first task exemple
//        Printer<Integer>  printer=  new Printer<>(box.getContent());

        Logger logger = Logger.getLogger(Main.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);

        logger.info("Логирование до использования контроллера");
        Controller controller = new Controller(new ConsoleView(), new CaclulatorModel(),logger);
        controller.workButton();
        logger.info("Логгирование после использования контроллера ");





    }
}