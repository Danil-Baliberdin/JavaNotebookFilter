
import JavaOOP.dz5.Controllerr;
import JavaOOP.dz5.StudyGroupService;
import JavaOOP.dz5.View;
import JavaOOP.dz6.firstTaskRefactor.Box;
import JavaOOP.dz6.firstTaskRefactor.Printer;


public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(1231);                    //dz 6  - first task exemple
        Printer<Integer>  printer=  new Printer<>(box.getContent());


    }
}