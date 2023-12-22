package JavaOOP.dz2;

import javax.crypto.spec.PSource;
import java.util.*;

public class Car extends Vehicle {
    private int fuelCapacity;
    private static int carID = 1; //статическое поле чтобы просто сделать уникальный id, для каждого подкласса
    private int currentFuelLevel ;
    private boolean isOff = true;
    private int currentSpeed;

    public Car( String br, String mod, int yer, int fuelLevel, int fuelCap){
        super( br,  mod,  yer);
        this.currentFuelLevel = fuelLevel;
        this.fuelCapacity = fuelCap;
        super.id = this.carID++;
    }
    public Car(String br, String mod, int yer,int fuelCap){
        this( br, mod,  yer, 0, fuelCap);
    }

    @Override
    public void startEngine() {
        if (isOff) {
            if (this.currentFuelLevel == 0) System.out.println("Нет топлива вы не можете завесети двигатель");
            else {
                isOff = false;
                System.out.println("Двигатель включен");
            }
        }
        else System.out.println("Двигатель рабоает вы не можете его включить дважды ");
    }

    @Override
    public void stopEngine() {
        if (!isOff) {
            if(currentSpeed>0){
                System.out.println("Сначала вы должны остановиться");
            }
            else {
                isOff = true;
                System.out.println("Двигатель выключен");
            }
        }
        else System.out.println("Двигатель выключен вы не можете его выключить дважды ");
    }

    @Override
    public void accelerate(int speed) {
        if(!isOff) {
            this.currentSpeed = currentSpeed + speed;
            System.out.println("скорость движения увеличена на "+speed+" км/ч");
        }
        else System.out.println("Двигатель выключен, вы не можете увеличить скорость ");

    }

    @Override
    public void brake() {
        if (currentSpeed>0){
            this.currentSpeed = 0;
            System.out.println("Вы остановились");
        }
        else System.out.println("Вы не можете тормозить, так как стоите на месте");
    }

    @Override
    public void displayInfo() {
        System.out.println("========================");
        System.out.println("Текущая информация о " + super.id +" "+ brand +" "+ model+" "+year);
        System.out.println("Уровень топлива - "+ currentFuelLevel);
        if (isOff) System.out.println("Двигатель выключен");
        else System.out.println("Двигатель включен");
        System.out.println("Текущая скорость - "+currentSpeed+ " км/ч");
        System.out.println("==========================");
    }


    public void refuel(int liters){
        if (currentFuelLevel == fuelCapacity ) System.out.println("Бак полон");
        else if((fuelCapacity - currentFuelLevel)<liters) {
            System.out.println("В баке не хватает только "+
                    (fuelCapacity - currentFuelLevel)+ " литров топлива, вы дозаправитель до полного бака  ");
            this.currentFuelLevel = fuelCapacity;
        }
        else System.out.println((this.currentFuelLevel = currentFuelLevel +  liters));;
    }

}
