package Exeptions.DZ3;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ParseController {
    private final ViewParser viewParser;
    private final Parser parser;
    private final Checker checker;

    public ParseController(ViewParser viewParser,Parser parser,Checker checker){
        this.parser = parser;
        this.viewParser = viewParser;
        this.checker = checker;
    }
    public void button(){
        viewParser.showGreeting();
        while (true){
            int loopEndCounter = 0;
            String  text = viewParser.getInput();
            if (text.split(" ").length<6){
                System.out.println("Вы ввели меньше параметров чем необходимоб пожалуйста повторите попытку");
                continue;
            }else if (text.split(" ").length>6){
                System.out.println("Вы ввели больше параметров чем необходимоб пожалуйста повторите попытку, в случае если количество параметров верное , то пожалуйста помните что между параметрами нужен только ОДИН пробел");continue;
            }
            for (String parametr: text.split(" ")) {
                if(checker.isOnlyDigit(parametr)){
                    try{
                        parser.parsePhoneNumber(parametr);
                        loopEndCounter++;
                    }catch (IOException e){
                        System.out.println("Wrong phone number length");
                    }
                }else if(checker.isOnlyLetter(parametr)&&parametr.length()==1){
                    try{
                        parser.parseGender(parametr);
                        loopEndCounter++;
                    }catch (IOException e){
                        System.out.println("You are wrote wrong gender letter");
                    }
                } else if (checker.hasPunctuations(parametr)) {
                    try {
                        parser.dateParser(parametr);
                        loopEndCounter++;
                    }catch (IOException e){
                        System.out.println("You are wrote wrong date");
                    }
                }
                else if(checker.isOnlyLetter(parametr)){
                    parser.parseName(parametr);
                    loopEndCounter++;
                }
                else  System.out.println("Please check your Name - Surname - Fathers name");

            }
            System.out.println(Arrays.toString(parser.getTempArray()));
            if(loopEndCounter == 6) break;


        }
        try (FileWriter fw = new FileWriter("C:\\Users\\Billy Herington\\IdeaProjects\\test\\src\\Exeptions\\DZ3\\TXTs\\"+parser.getTempArray()[0]+".txt",true))
        {
            for (String parametr: parser.getTempArray()) {
                fw.write(String.format("<%s>",parametr));
            }
            fw.write("\n");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

}
