package collectionapp;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        
        Set<String> FruitList = new HashSet<>();
        
        FruitList.add("Apel");
        FruitList.add("Durian");
        FruitList.add("Jeruk");
        
        for (var value : FruitList){ 
            System.out.println(value);
        }
        
        System.out.print("\n");
        findFruit(FruitList, "Apel");
        findFruit(FruitList, "Stroberi");
        
         System.out.print("\n");
         System.out.println("Sebelum di clear :");
        EmptyCheck(FruitList); 
        
        FruitList.clear();
        
        System.out.println("Setelah di clear :");
        EmptyCheck(FruitList);
        
    }
    
    static void findFruit(Set<String> FruitList, String Fruit){
            if(FruitList.contains(Fruit)){
                System.out.println("Ada buah " + Fruit + " dalam list");
            } else {
                System.out.println("Tidak Ada buah " + Fruit + " dalam list");
            }
        }
    
    static void EmptyCheck(Set<String> FruitList){
            if(!FruitList.isEmpty()){
                System.out.println("Ada buah dalam list");
            } else {
                System.out.println("List kosong");
            }
        }
}