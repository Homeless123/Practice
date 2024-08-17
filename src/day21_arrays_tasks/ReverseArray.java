package day21_arrays_tasks;

import java.util.Arrays;

/*
Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

			Example:
				array = {1,2,3,4,5};

			Output:
				reversedArray = {5,4,3,2,1};

 */
public class ReverseArray {
    public static void main(String[] args) {
        // creat array class
        int[] array = {1, 2, 3, 4, 5};
// Create a new array to hold the reversed elements
        int[] reverseArray = new int[array.length];
        // Reverse the elements from the original array into the new array

        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }

        System.out.println("reversedArray = " + Arrays.toString(reverseArray));


        }
    }

