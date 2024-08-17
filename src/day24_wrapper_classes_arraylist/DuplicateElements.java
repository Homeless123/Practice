package day24_wrapper_classes_arraylist;

import day17_customClass.Address;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a class called DuplicateElements and write a program with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */
public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        int size=list.size();
        for (int i = 0; i < size; i++) {
            list.add(list.get(i));
        }
        System.out.println(list);


        // seconf way i saw

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list1);
        list1.addAll(list1);
        System.out.println(list1);
        }

    }

