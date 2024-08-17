package day21_arrays_tasks;

import java.util.Arrays;

/*
Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.

			Example:
				array = {10, 0, 5, 0, 1, 0};

			Output:
				{10, 5, 1, 0, 0, 0};

 */
public class MoveTheZeros {
    public static void main(String[] args) {
        // creat array class
        int [] array = {10, 0, 5, 0, 1, 0};
        int [] moved = new int[array.length];
        //  move all the zeros to the end of the array.
        for(int i = 0, j = 0; i < array.length; i++){
            if(array[i] != 0){
                moved[j++] = array[i];
           }
        }
        System.out.println(Arrays.toString(moved));

    }
}
