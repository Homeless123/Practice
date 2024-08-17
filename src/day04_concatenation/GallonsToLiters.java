package day04_concatenation;

public class GallonsToLiters {
    /*
     Create a class named GallonsToLiters and declare the following variables:
                gallon
                liters

    4.1 Write a program that can convert the any given number of gallons to liters
        Ex:
              gallon = 10

        output:
              10 gallons is equal to 37.9 litters

           Hint:  1 gal = 3.79 L
     */
    public static void main(String[] args) {
        int gallons=10;
        double liters=37.9;
        System.out.println(gallons+" gallons is equal to "+liters+" litters");
        System.out.println("1gal="+liters/10+"L");
    }

}
