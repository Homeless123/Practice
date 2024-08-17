package day24_wrapper_classes_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Create a class called MoveTheZeros and write a program with the following specifications:
   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

	            Example:
	                list: {1,0,2,0,3,0,4,0}

	            output:
	                [1, 2, 3, 4, 0, 0, 0, 0]

 */
public class MoveTheZeros {
    public static void main(String[] args) {

        // Create an ArrayList and add elements
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        // Count the number of zeros in the original list
        int zeroCount = Collections.frequency(list, 0);

        // Remove all zeros from the list
        list.removeIf(p -> p == 0);

        // Add zeros to the end of the list
        for (int i = 0; i < zeroCount; i++) {
            list.add(0);
        }

        // Print the modified list
        System.out.println(list);
    }
}
