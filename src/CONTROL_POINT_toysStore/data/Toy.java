package CONTROL_POINT_toysStore.data;

public class Toy {
    private int price;
    private static int id;
    private String name;
    public Toy(int price, String name){
        this.price = price;
        this.id++;
        this.name = name;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return String.format("name - %s, price - %d",name,price);
    }
}
