import JavaOOP.dz2.Aircraft;
import JavaOOP.dz2.Boat;
import JavaOOP.dz3.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup("Group1");
        StudyGroup group2 = new StudyGroup("Group2");
        StudyGroup group3 = new StudyGroup("Group3");
        StudyGroup group4 = new StudyGroup("Group4");
        StudyGroup group5 = new StudyGroup("Group5");


        Stream stream1 = new Stream("Streaem1");
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream("Stream2");
        stream2.addGroup(group3);
        stream2.addGroup(group4);
        stream2.addGroup(group5);

        Stream stream3 = new Stream("Stream3");
        stream3.addGroup(group3);


        for (StudyGroup item:stream1
             ) {
            System.out.println(item.getName());
        }

        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream1);
        streamList.add(stream2);
        streamList.add(stream3);

        streamList.sort(new StreamComparator());
        for (Stream str:streamList
             ) {
            System.out.println(str.getName());
        }
        StreamService service =  new StreamService();
        Controller controller = new Controller(service);

        controller.srt(streamList);
        for (Stream st :
                streamList) {
            System.out.println();
            System.out.print("Название потока: "+ st.getName()+", ходящие в него группы: ");
            for (StudyGroup group:st
                 ) {
                System.out.print(group.getName() + ", ");
            }

        }
    }
}