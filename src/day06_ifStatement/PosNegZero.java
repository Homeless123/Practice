package day06_ifStatement;

public class PosNegZero {
    /*
    1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero

Ex:

number = 20

output:
Positive
     */
    public static void main(String[] args) {

        int number = 20;
        if (number < 0) {
            System.out.println("Negative number");
        }else {
            System.out.println("Positive number");
        }
        System.out.println("********OR********");
        if (number < 0) {
            System.out.println("Negative number");
        }
        if (number > 0) {
            System.out.println("Positive number");
        }
        if (number == 0) {
            System.out.println("Zero number");
        }
    }
}
