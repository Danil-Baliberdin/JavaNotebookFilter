package JavaOOP.dz3;

import java.util.List;

public class StreamService extends StreamComparator{

    public void sortStream(List<Stream>listOfStreams) {
        listOfStreams.sort(new StreamComparator());
    }
}
