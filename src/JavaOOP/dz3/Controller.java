package JavaOOP.dz3;

import JavaOOP.dz5.StudyGroupService;
import JavaOOP.dz5.View;

import java.util.List;

public class Controller {
    private StreamService service;
    public Controller(StreamService service){
        this.service= service;
    }

    public Controller(View view, StudyGroupService studyGroupService) {
    }

    public void srt(List<Stream> streamList){
        service.sortStream(streamList);
    }
}
