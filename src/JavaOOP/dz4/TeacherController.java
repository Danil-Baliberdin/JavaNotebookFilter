package JavaOOP.dz4;

public class TeacherController extends TeacherView{
        public void createTeacher(int age, int length, int salary,String name){
                TeacherView.addTeacher(new Teacher(23,1,30000,"Ivanovna "));
        }
        public void changeTeacherName(int id, String name){
                teachers.get(id-1).setName(name);
        }
        public void changeTeacherAge(int id, int age){
                teachers.get(id-1).setAge(age);
        }
        public void changeTeacherSalary(int id, int salary){
                teachers.get(id-1).setSalary(salary);
        }
        public void changeTeacherLength(int id, int length){
                teachers.get(id-1).setLenght(length);
        }



}
