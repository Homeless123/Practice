package day09_scanner;

import java.util.Scanner;
/*
Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double radius = input.nextDouble();

        input.close();

        double area = 3.14 * radius * radius;

        double perimeter = 2 * radius *3.14;

        System.out.println("The area of the circle is " + area);

        System.out.println("The perimeter of the circle is " + perimeter);

        System.out.println("//////////////////////////////////");



    }
}
