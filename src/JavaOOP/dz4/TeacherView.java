package JavaOOP.dz4;

public class TeacherView extends TeacherService{
    public void showTeachersInfo(){
        for (Teacher item:teachers
             ) {
            System.out.println("============================");
            item.getInfo();
            System.out.println("============================");
        }
    }
}
