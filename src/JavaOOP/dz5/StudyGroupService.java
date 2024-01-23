package JavaOOP.dz5;

import java.util.ArrayList;
import java.util.List;
public class StudyGroupService {
    private static int gpoupsId;
    public StudyGroup createGroup(Teacher teacher, List<Student> students){
        groups.add(new StudyGroup(teacher,students));
        return groups.get(0);
    }
    private ArrayList<StudyGroup> groups= new ArrayList<>();
    public void showTeacherId(){
        System.out.println( groups.get(0).teacher.getId());
    }
    public void showStudentsId(){
        for (int i = 0; i < groups.get(0).students.size(); i++) {
            System.out.println(groups.get(0).students.get(i).getId());
        }
    }

}
