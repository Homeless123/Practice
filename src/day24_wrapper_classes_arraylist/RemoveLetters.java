package day24_wrapper_classes_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

			Example:
				list = {'$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

			output:
				['$', '1', '2', '@', '!', '3', '4']
 */
public class RemoveLetters {
    public static void main(String[] args) {

        // Initialize the ArrayList with characters including letters and non-letters
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));

        // Create a new list to store non-letter characters
        ArrayList<Character> nonLetters = new ArrayList<>();

        // Iterate through the original list
        for (Character each : list) {
            // Check if the character is not a letter
            if (!Character.isLetter(each)) {
                // Add non-letter characters to the new list
                nonLetters.add(each);
            }
        }

        // Print the list with letters removed
        System.out.println(nonLetters);

        System.out.println("-----second way easy way----- ");

        // or

        // Remove all letters from the ArrayList
        list.removeIf(p -> Character.isLetter(p));

        // Print the ArrayList with letters removed
        System.out.println(list);





    }
}
