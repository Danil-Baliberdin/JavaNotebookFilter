package JavaOOP.dz5;

public class Teacher{
    private int id;
    private static int counter;
    public Teacher(){
        counter++;
        this.id = counter;
    }
    public int getId(){
        return id;
    }

}
