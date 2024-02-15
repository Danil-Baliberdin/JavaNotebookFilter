


import Exeptions.DZ3.Checker;
import Exeptions.DZ3.ParseController;
import Exeptions.DZ3.Parser;
import Exeptions.DZ3.ViewParser;
import Exeptions.FirstSeminar.RunTimeExeption;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) throws IOException {
        ParseController parseController = new ParseController(new ViewParser(),new Parser(),new Checker());
        parseController.button();
        // ПРИМЕРЫ ФАЙЛОВ В ПАПКЕ TXTs, само приложение в папке DZ3


    }


}