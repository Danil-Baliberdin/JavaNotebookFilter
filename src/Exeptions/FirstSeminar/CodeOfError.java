package Exeptions.FirstSeminar;

public class CodeOfError {
    //Первый и самый прстой способ обработки ошибок в коде это КОД ОШИБКИ:
    //то есть мы заранее понимаем где может быть ошибка и прописывае код в котором если эта ошибка ловится ,
    //то мы получаем, нами заранее определённый - код ошибкиб далее в задании это будет -1
    int[] array;
    public CodeOfError(int[] array){
        this.array = array;
    }
    public void numSeeker(int neededNumber){
        int counter = 0;
        for (int item:
             array) {
            if (item == neededNumber) {
                System.out.println("Number is found");
                counter++;
            }

        }
        if (counter==0){
            System.out.println("Number isnt found");
        }
    }
    public void arrayLengthCheker(int minValue){
        if (array.length<minValue){
            System.out.println("Array length lower than minValue");
        }
        else System.out.println("fine length");
    }
}
