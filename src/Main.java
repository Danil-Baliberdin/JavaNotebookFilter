import JavaOOP.dz2.Aircraft;
import JavaOOP.dz2.Boat;
import JavaOOP.dz3.*;
import JavaOOP.dz4.Teacher;
import JavaOOP.dz4.TeacherController;
import JavaOOP.dz4.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        controller.createTeacher(20,2,40000,"Ivanovna");
        controller.showTeachersInfo();
        controller.changeTeacherSalary(1,350000);
        controller.showTeachersInfo();
    }
}