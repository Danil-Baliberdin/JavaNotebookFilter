package JavaOOP.Lection5Tasks.Second;

public interface ModelBook {
    public void addContact(String name, String number);
    public void deleteContact(String name);
    public void showContact(String name);
    public void updateContact(String name,String number);
}
