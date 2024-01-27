package JavaOOP.Lection6tasks.First;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diary {
     private Map<Integer,String> pages =  new HashMap<>();
    public void writeToDiary(Integer pageNum,String note){
        if(pageNum<1) {
            System.out.println("Вы ввели некоррекктный номер страниицы, пожалуйста попробуйте еще раз");
            return;
        }
        pages.put(pageNum,note);
    }
    public void showNote(Integer pageNum){
        if(pageNum<1) {
            System.out.println("Вы ввели некоррекктный номер страниицы, пожалуйста попробуйте еще раз");
            return;
        }
        System.out.println(pages.get(pageNum));
    }

}
