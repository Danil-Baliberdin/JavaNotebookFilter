package JavaOOP.dz3;

import java.util.List;

public class Controller {
    private StreamService service;
    public Controller(StreamService service){
        this.service= service;
    }

    public void srt(List<Stream> streamList){
        service.sortStream(streamList);
    }
}
