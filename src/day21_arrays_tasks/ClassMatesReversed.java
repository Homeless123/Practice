package day21_arrays_tasks;

import java.util.Arrays;

/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */
public class ClassMatesReversed {
    public static void main(String[] args) {
     String[] classMates = {"John", "Smith", "Johnson", "Alex", "Manuel", "Simba", "Tarzan", "Alberto", "Jose", "April"};
            for (String name : classMates) {
                System.out.println(name);
        }

    }
}
