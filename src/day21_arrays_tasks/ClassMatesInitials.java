package day21_arrays_tasks;

import java.util.Arrays;

/*
reate a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.


 */
public class ClassMatesInitials {
    public static void main(String[] args) {
        // 2.1 Create an array of strings named classmates.
        String[] names = new String[10];
        // 2.2 Store full names of 10 classmates.
        names[0] = "John";
        names[1] = "Jane";
        names[2] =  "Doe";
        names[3] = "Jack";
        names[4] = "Jane";
        names[5] = "Jack";
        names[6] = "Jane";
        names[7] = "Jack";
        names[8] = "Jane";
        names[9] = "Jane";
            //2.3 Print the initials of each student's name in separate lines.
        System.out.println(Arrays.deepToString(names));

    }
}
