package day04_concatenation;

public class Square {
    /*
     Create a class named Square and declare the following variables:
                side
                area
                perimeter

    5.1 Write a program that can calculate the area and perimeter of a square with any given  side
        Ex:
              side = 5

        output:
               Area of the square is 25
               Perimeter of the square is 20
     */
    public static void main(String[] args) {
        int side=5,
                area=side*side,
                perimeter=side*4;
        System.out.println("Area of Square is "+area);
        System.out.println("Perimeter of Square is "+perimeter);



    }

}
