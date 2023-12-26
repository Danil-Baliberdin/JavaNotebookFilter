package JavaOOP.dz3;

import com.sun.jdi.PrimitiveValue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private String name;
    public Stream(String name){
        this.name = name;
    }
    private List<StudyGroup> listOfGroups = new ArrayList<StudyGroup>();

    public void addGroup (StudyGroup group){
        listOfGroups.add(group);
    }
    public int groupsAmount(){
        return listOfGroups.size();
    }

    @Override
    public Iterator iterator() {
         return listOfGroups.iterator();
    }
    public String getName(){
        return name;
    }
}
