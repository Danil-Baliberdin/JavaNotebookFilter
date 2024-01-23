package JavaOOP.Lection5Tasks.Second;

public class Presentor {
    PhoneBookModel phoneBookModel;
    View view;
    public Presentor(View view, PhoneBookModel bookModel){
        this.view = view;
        this.phoneBookModel = bookModel;
    }

    public void start (){
       while (true){

           view.showMenu();
           String actionNumber = view.getInfo();

           if (actionNumber.equalsIgnoreCase("1")){
               phoneBookModel.addContact(view.gimmeName(),view.gimmeNumber());
           }

           else if (actionNumber.equalsIgnoreCase("2")) {
               phoneBookModel.deleteContact(view.gimmeName());
           }

           else if (actionNumber.equalsIgnoreCase("3")) {
               phoneBookModel.showContact(view.gimmeName());
           }

           else if (actionNumber.equalsIgnoreCase("4")) {
               phoneBookModel.phoneBook.get(view.gimmeName()).setNumber(view.gimmeNumber());
           }
           else break;
       }
    }
}
