package day21_arrays_tasks;

import java.util.Arrays;

/*
Create a class named GroceryItems and write a program with the following specifications:
    10.1 Given the following array:
         String[][] items = {
             {"Apple", "Banana", "Grape", "Avocado"},
             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
         };

    10.2 Print the following output: (add \t between two words)
         Apple    Banana   Grape    Avocado
         Paper Towels     Toilet Papers   Tissues    Diapers
         Coke   Fanta   Arizona Tea   Pepsi   Water

    10.3 Print the following output: (add \t between two words)
         Avocado   Grape    Banana    Apple
         Diapers   Tissues   Toilet Papers   Paper Towels
         Water    Pepsi    Arizona Tea    Fanta   Coke

    10.4 Print the following output: (add \t between two words)
         Coke   Fanta   Arizona Tea   Pepsi   Water
         Paper Towels     Toilet Papers   Tissues    Diapers
         Apple    Banana   Grape    Avocado

 */
public class GroceryItems {
    public static void main(String[] args) {
        // first steps
        String[][] items = {    {"Apple", "Banana", "Grape", "Avocado"},
                                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}  };
        // second steps by print 
        for (String[] eachItems : items) {
            System.out.println();
            for (String eachElements : eachItems) {
                System.out.print(eachElements+",\t");
            }
        }
        System.out.println();
        // write like z ~~a
        for (String[] back : items) {
            System.out.println();
            for (int i = back.length - 1; i >= 0; i--) {
                System.out.print(back[i]+", \t");}
        }
        System.out.println("\n");
        // last steps is 3 2 1 yukardan asagi
        for(int i = items.length - 1; i >= 0; i--){

            for(String eachItem : items[i]){
                System.out.print(eachItem + "\t");}
            System.out.println();}
            }
        }