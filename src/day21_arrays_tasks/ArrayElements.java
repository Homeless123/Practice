package day21_arrays_tasks;
/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
 */

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        // Create an array of integers with a length of 100.  ------- 1
        int[] numbers = new int[100];
        // Assign values from 1 to 100 to the indexes of the array. ******* 2
        for(int i = 1; i <= 100; i++){
            numbers[i - 1] = i; ;
        }
        // Display the array elements in a single line separated by spaces. ////// 3
        for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[j] + " ");
            }
        System.out.println();
        //Display the array elements in a single line separated by spaces. ++++++++4
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        //Display all evenly divisible elements by 5 in a single line separated by spaces.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%5 ==0){
                System.out.print(numbers[i]+" ");
            }
        }




        }

    }

