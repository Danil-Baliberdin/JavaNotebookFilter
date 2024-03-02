package JavaArchitecture.Tasks;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
    }

    public Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doto(){
        System.out.println("work");
    }
}
