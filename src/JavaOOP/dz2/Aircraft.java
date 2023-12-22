package JavaOOP.dz2;

import javax.sound.midi.Soundbank;

public class Aircraft extends Vehicle implements Flyable{
    private static int carID = 1;
    private int maxAltitude ;
    private boolean isFlying;
    private int currentSpeed;
    private boolean isOff = true;
    private boolean shassiOn = true;
    public Aircraft( String br, String mod, int yer,int maxAt) {
        super( br, mod, yer);
        this.maxAltitude = maxAt;
        super.id = this.carID++;
    }

    @Override
    public void takeOff() {
        if(isOff){
            System.out.println("Перед тем как взлететь нужно включить двигател");
        }
        else if(currentSpeed<300){
            System.out.println("Для того чтобы взлететь нужно набрать 300 км/ч");
        }
        else {
            this.isFlying = true;
            shassiSwitch();
            System.out.println("Вы летите и шасси подняты");
        }
    }
    public void shassiSwitch(){
        if (this.shassiOn) this.shassiOn= false;
        else this.shassiOn = true;
    }

    @Override
    public void land() {
        if (!shassiOn) {
            System.out.println("Перед тем как сесть опустите шасси");
        }
        else System.out.println("Вы приземлились");
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
        if(isOff){
            System.out.println("Двигатель уже выключен, вы не можете выключить его дважды");
        } else if (this.isFlying) {
            System.out.println("Перед тем как выключить двигатель вам нужно приземлиться ");
        } else if (this.currentSpeed>0) {
            System.out.println("Перед тем как выключить нужно остановиться");
        }
        else {
            this.isOff = true;
            System.out.println("Двигатель выключен");
        }
    }

    @Override
    public void accelerate(int speed) {
        if(isOff){
            System.out.println("Чтобы набирать скорость вы должны включить двигатель");
        }
        else this.currentSpeed = currentSpeed + speed;
    }

    @Override
    public void brake() {
        if(this.isFlying==false){
            this.currentSpeed = 0;
            System.out.println("Самолет остановился");
        }
        else System.out.println("Прежде чем остановиться , вы должны сесть на землю");
    }


    @Override
    public void displayInfo() {
        System.out.println("========================");
        System.out.println("Текущая информация о " + id + " " + brand + " " + model + " " + year);
        System.out.println("Максимальная высота " + maxAltitude + " м");
        if (shassiOn) System.out.println("Шасси выпущены");
        else System.out.println("Щасси подняты ");
        if (isOff) System.out.println("Двигатель выключен");
        else System.out.println("Двигатель включен");
        System.out.println("Текущая скорость - " + currentSpeed + " км/ч");
        if (isFlying) {
            System.out.println("Самолет летит");
        } else System.out.println("Самолет приземлен");
        System.out.println("==========================");
    }
}
