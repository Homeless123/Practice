package day24_wrapper_classes_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7));
        ArrayList<Integer> unique = new ArrayList<>(); // Initialize list to store unique elements

        // Iterate through the original list
        for (int each : list) {
            // Check if the unique list already contains the element
            if (!unique.contains(each)) {
                unique.add(each); // Add element to unique list if not already present
            }
        }

        // Print the list with duplicates removed
        System.out.println(unique);
    }
}
