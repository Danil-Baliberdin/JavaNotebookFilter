package JavaOOP.dz2;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Vehicle {
    protected int id;
    protected String brand ;
    protected String model ;
    protected int year ;

    public Vehicle(String br, String mod, int yer){
        this.brand = br;
        this.model = mod;
        this.year = yer;
    }
    abstract void startEngine() ;
    abstract void stopEngine() ;
    abstract void accelerate(int speed) ;
    abstract void brake() ;
    abstract void displayInfo();
}
