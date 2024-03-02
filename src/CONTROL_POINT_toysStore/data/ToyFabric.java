package CONTROL_POINT_toysStore.data;

import CONTROL_POINT_toysStore.data.Randomizer;
import CONTROL_POINT_toysStore.data.Toy;

public class ToyFabric {
    Randomizer rnd = new Randomizer();
    public Toy newToy(){
        return new Toy(rnd.getPrice(), rnd.getRandomName());
    }
}
