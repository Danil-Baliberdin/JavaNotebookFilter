package JavaOOP.dz4;

public class Teacher<T>{
    static int id = 0 ;
    private String name;
    private T age;
    private T lengthOfTeaching;
    private T salary;


    public Teacher(T age,T lengthOfTeaching,T salary, String name){
        this.age = age;
        this.lengthOfTeaching = lengthOfTeaching;
        this.salary = salary;
        this.name= name;
        id++;
    }

    protected void getInfo(){
        System.out.println("salary = "+this.salary+"\n"+"age = "+this.age+"\n"+"lenth of teaching = "
                +this.lengthOfTeaching+"\nname = "+ this.name+"\nid = "+id);
    }
    public void setName(String name ){
        this.name = name;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }

    public void setLenght(T length) {
        this.lengthOfTeaching = length;
    }
}
