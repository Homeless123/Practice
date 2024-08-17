package day24_wrapper_classes_arraylist;
/*
1. Create a class called SameFirstAndLast and write a program with the following specifications:
    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Canada", "Lan", "Ebrahim", "Farida"]

 */

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        // Remove elements where the first and last characters are the same (case-insensitive)
        list.removeIf(p -> !p.isEmpty() && p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)));
/*
Explanation:
Empty String Check:

Added !p.isEmpty() to ensure that the string is not empty before checking characters to avoid potential exceptions.
Condition Explanation:

p.substring(0, 1) gets the first character.
p.substring(p.length() - 1) gets the last character.
equalsIgnoreCase is used to compare these characters without considering their case.
 */
        // Print the resulting list
        System.out.println(list);

    }
}
