package day24_wrapper_classes_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
 */
public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        // Initialize the ArrayList with integers
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Set initial max and min to the first element in the list
        int max = list.get(0);
        int min = list.get(0);

        // Iterate through the list to find max and min
        for (Integer each : list) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }

        // Display the maximum and minimum numbers
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}
