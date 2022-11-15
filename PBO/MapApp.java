package collectionapp;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    
    public static void main(String[] args) {
        Map<String, String> FruitMap = new HashMap<>();
        
        FruitMap.put("Banana", "Yellow");
        FruitMap.put("Apple", "Red");
        FruitMap.put("Watermelon", "Green");
  
        displayEl(FruitMap); 
        
        System.out.println(FruitMap.get("Banana"));
    }
    
    static void displayEl(Map<String, String> FruitMap){
        for(HashMap.Entry<String, String> fruit : FruitMap.entrySet()){
            System.out.println("Fruit : " + fruit.getKey() + "\tColor : " + fruit.getValue());
        }
    }
    
}