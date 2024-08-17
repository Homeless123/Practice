package day21_arrays_tasks;

import java.util.Arrays;

/*
Create a class named CommonElements and write a program that prints out the common elements from two integer arrays.

			Example:
				arr1: {1,2,3,4,5}
				arr2: {4,5,6,7,8}

			Output:
				4
				5
 */
public class CommonElements {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {4,5,6,7,8};
        int [][] arr3 ={arr1,arr2};
        System.out.println(Arrays.deepToString(arr3));
        System.out.println("**********************************");
        for (int number1 : arr1) {
            for (int number2 : arr2) {
                if (number1 == number2) {
                    System.out.println(number1);
                }
            }
        }
        System.out.println("Tnx");
    }
}
