import CONTROL_POINT_toysStore.Controller;
import CONTROL_POINT_toysStore.data.Lototrone;
import CONTROL_POINT_toysStore.view.ViewModel;
import Exeptions.DZ3.Checker;
import Exeptions.DZ3.ParseController;
import Exeptions.DZ3.Parser;
import Exeptions.DZ3.ViewParser;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        Controller lototrone = new Controller(new ViewModel(),new Lototrone());
        lototrone.letsPlay();


    }


}