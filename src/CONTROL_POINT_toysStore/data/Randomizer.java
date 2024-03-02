package CONTROL_POINT_toysStore.data;

import java.util.ArrayList;
import java.util.List;

public class Randomizer {

    public String getRandomName(){
        ArrayList<String> namePull = new ArrayList<>();
        namePull.add("Bunny");
        namePull.add("Puppy");
        namePull.add("Kitty");
        namePull.add("Car");
        namePull.add("Lego");
        int toyID = (int) (Math.random()*namePull.size());
        return namePull.get(toyID);
    }
    public int getPrice(){
        return (int)((Math.random()*5000));
    }

}
