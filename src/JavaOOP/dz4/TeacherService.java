package JavaOOP.dz4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TeacherService implements Iterable{
    static List<Teacher> teachers = new ArrayList<>();

    public static void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    @Override
    public Iterator iterator() {
        return teachers.iterator();
    }
     
}
