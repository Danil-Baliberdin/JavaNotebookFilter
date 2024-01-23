package JavaOOP.Lection5Tasks.Second;

public class PhoneBookModel extends Book{


    @Override
    public void addContact(String name, String number) {
        phoneBook.put(name.toLowerCase(), new Contact(name, number));
    }

    @Override
    public void deleteContact(String name) {
        phoneBook.remove(name);
    }

    @Override
    public void showContact(String name) {
        System.out.println(phoneBook.get(name).toString());
    }

    @Override
    public void updateContact(String name, String number) {
        phoneBook.get(name).setNumber(number);
    }
}
