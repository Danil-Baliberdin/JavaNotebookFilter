package JavaOOP.dz2;

public class Boat extends Vehicle implements Swimmable{
    private static int carID = 1;
    private int maxSpeed ;
    private boolean isSailing;
    private boolean isOff;

    public Boat( String br, String mod, int yer, int max) {
        super( br, mod, yer);
        this.maxSpeed = max;
        super.id = this.carID++;
    }

    @Override
     public void startEngine() {
        if (isOff) {
            this.isOff = false;
            System.out.println("Двигатель включен");
        }else System.out.println("Двигатель уже включен, вы не можете включить его дважды");
    }

    @Override
    public void stopEngine() {
        if (isOff) {
            System.out.println("Двигатель выключен, вы не можете выключить его дважды");
        }
        else if(isSailing){
            System.out.println("Перед тем как выключить двигатель , нужно остановиться ");
        }
        else {
            this.isOff = true;
            System.out.println("Двигатель выключен");
        }
    }

    @Override
    void accelerate(int speed) {

    }

    @Override
    void brake() {

    }

    @Override
    public void displayInfo() {
        System.out.println("========================");
        System.out.println("Текущая информация о " + id + " " + brand + " " + model + " " + year);
        System.out.println("Максимальная скорость " + maxSpeed + " м");
        if (isOff) System.out.println("Двигатель выключен");
        else System.out.println("Двигатель включен");
        if (isSailing) {
            System.out.println("Лодка плывет");
        } else System.out.println("Лодка стоит");
        System.out.println("==========================");
    }


    @Override
    public void startSwimming() {
        if(!this.isOff){
            this.isSailing = true;
            System.out.println("Лодка поплыла");
        }
        else System.out.println("Сначала включите двигатель");
    }

    @Override
    public void stopSwimming() {
        if(isOff){
            System.out.println("Вы уже стоите так как двигатель выключен");
        }
        else if(!isSailing){
            System.out.println("Вы уже стоит на месте");
        }
        else {
            this.isSailing = false;
            System.out.println("Лодка остановилась");
        }
    }
}
