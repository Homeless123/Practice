package day09_scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter the cents : ");

        int cents = input.nextInt();

        int dollars = cents/100;// **.-- writing ** method

        cents = cents%100; // **.-- writing -- method

        System.out.println("Dollars : " + dollars);

        System.out.println("Cents : " + cents);



    }
}
