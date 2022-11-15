package collectionapp;

import java.util.LinkedList;

public class LinkedListApp {
     public static void main(String[] args) {
         
         LinkedList<String> Letters = new LinkedList<>();
         
         Letters.add("A");
         Letters.add("B");
         Letters.add("C");
         Letters.add("D");
         
         System.out.println("Linked list : " + Letters);
         System.out.println("Queue size : " + Letters.size());
         
         while(!Letters.isEmpty()){
             System.out.println(Letters.removeFirst());
         }
         
         System.out.println("Linked list : " + Letters);
         
         LinkedList<String> LettersStack = new LinkedList<>();
         
         LettersStack.push("One");
         LettersStack.push("Two");
         LettersStack.push("Three");
         LettersStack.push("Four");
         
         System.out.println("Linked list : " + LettersStack);
         
         LettersStack.pop();

          while(!LettersStack.isEmpty()){
             System.out.println(LettersStack.removeFirst());
         }
          
         
         System.out.println("Linked list : " + LettersStack);
     }
}