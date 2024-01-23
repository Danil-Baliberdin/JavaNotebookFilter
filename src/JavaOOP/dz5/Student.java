package JavaOOP.dz5;
public class Student{
    private int id;
    private static int counter;
    public Student(){
        counter++;
        this.id = counter;
    }
    public int getId(){
        return id;
    }

}
