package day09_scanner;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        /*
        Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles: ");
        int miles = input.nextInt();
        if (miles <= 1000) {
            double km = miles * 1.609;
            System.out.println("Kilometers: " + km);
        }




    }
}
