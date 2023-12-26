package JavaOOP.dz3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{

    @Override
    public int compare(Stream o1, Stream o2) {
        if(o1.groupsAmount()<o2.groupsAmount()){
            return 1;
        }
        else if(o1.groupsAmount()>o2.groupsAmount()){
            return -1;
        }
        else return 0;
    }
}
