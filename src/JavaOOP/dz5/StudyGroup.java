package JavaOOP.dz5;

import java.util.List;

public class StudyGroup {
    protected Teacher teacher;
    protected List<Student> students;
    public StudyGroup(Teacher teacher, List<Student> students){
        this.teacher = teacher;
        this.students = students;
    }
    public List<Student> getStudents(){
        return this.students;
    }

}