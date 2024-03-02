package CONTROL_POINT_toysStore.data;

import java.util.ArrayList;

public class LotteryModel {
    ToyFabric tf = new ToyFabric();
    public int getWinChance(int price){
        if(price<=1000){
            return 25;
        }else if(price>1000&&price<=2500){
            return 10;
        }else return 5;
    }
    public boolean superPrizeCheck(){
        int rnd1 = (int)(Math.random()*100);
        int rnd2 = (int)(Math.random()*100);
        if (rnd1==rnd2) return true;
        else return false;
    }
    public int play(Toy toy){
        if (superPrizeCheck()) return 10;

        int rnd = (int)(Math.random()*100);
        int chance = getWinChance(toy.getPrice());
        if (rnd<=chance) return 1;
        else return 0;
    }
}
