package collectionapp;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        
        List<String> StudentList = new ArrayList<>();
        
        StudentList.add("Bima");
        StudentList.add("Kevin");
        StudentList.add("Vino");
        StudentList.add("Rendi");
        
        System.out.println("List Sebelum diedit");
        for(var value : StudentList){ 
            System.out.println(value);
        }
        
        System.out.print("\n");
        StudentList.remove(2);
        StudentList.add(1, "Rama");
        
        System.out.println("List Setelah diedit");
        for(var value : StudentList){
            System.out.println(value);
        }
    }
}