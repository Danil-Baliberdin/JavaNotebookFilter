package CONTROL_POINT_toysStore.data;

import java.util.ArrayList;

public class Lototrone extends LotteryModel{
    ToyFabric tf = new ToyFabric();
    private static ArrayList<Toy> toysPull = new ArrayList<>();
    private static ArrayList<Toy> prizePull = new ArrayList<>();
    public void halfArrivale(){
        for (int i = 0; i < 5; i++) {
            toysPull.add(tf.newToy());
        }
    }
    public void fullArrivale(){
        for (int i = 0; i < 10; i++) {
            toysPull.add(tf.newToy());
        }
    }
    public void moveToPrizePull(int toyID){
        prizePull.add(toysPull.get(toyID));
        toysPull.remove(toyID);
    }
    public void moveToPrizePull(){
        prizePull = (ArrayList<Toy>) toysPull.clone();
        toysPull.removeAll(toysPull);
    }
    public ArrayList<Toy> getToysPull(){
        return toysPull;
    }
    public ArrayList<Toy> getPrizePull(){
        return prizePull;
    }

}
