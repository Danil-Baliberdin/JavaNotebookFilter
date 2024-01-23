package JavaOOP.Lection5Tasks.Second;

public class Contact {
    private String name;
    private String number;
    public Contact(String name, String number){
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return ("Имя контакта - "+name+"\nНомер кнтакта - "+number);
    }
}
