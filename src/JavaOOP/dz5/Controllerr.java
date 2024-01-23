package JavaOOP.dz5;

import java.util.ArrayList;

public class Controllerr {
    View view;
    StudyGroupService studyGroupService;
    public Controllerr(View view, StudyGroupService studyGroupService){
        this.view = view;
        this.studyGroupService = studyGroupService;
    }
    public void workButton(){
        while (true){
            System.out.println("Выберите пожалуйста действие 1 - создать группу, 2 - айди студентов, 3 - айди учителя");
            int choice = view.usersChoice();
            if (choice==1){
                ArrayList<Student> students = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    students.add(new Student());
                }
                studyGroupService.createGroup(new Teacher(),students);
            }
            else if (choice==2){
                studyGroupService.showStudentsId();
            } else if (choice==3) {
                studyGroupService.showTeacherId();
            }
            else break;
        }
    }
}
