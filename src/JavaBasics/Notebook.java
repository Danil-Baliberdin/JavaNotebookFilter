package JavaBasics;

import java.util.LinkedHashMap;
import java.util.Map;

public class Notebook {
    Map<String,String> spec = new LinkedHashMap<>();
    String name;
    String price;
    String brand;
    String capasityOfRAM;
    String storageCapasity;


    public void setSpec() {
        spec.put("name", this.name);
        spec.put("price",this.price);
        spec.put("brand", this.brand);
        spec.put("capasityOfRAM", this.capasityOfRAM);
        spec.put("storageCapasity", this.storageCapasity);
    }

    public Map<String, String> getSpecs(){
        return spec;
    }
    public String getName(){
        return this.name;
    }
}