package day09_scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    /*
    Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the order: ");
        String name = input.nextLine();

        System.out.println("Enter the price of the order: ");
        double price = input.nextDouble();

        System.out.println("Enter the quantity of the order: ");
        int quantity = input.nextInt();
        input.nextLine();

        System.out.println("Enter your first name : ");
        String firstName = input.nextLine();
        input.close();

        double price1 = price * quantity;

        System.out.println(firstName+" your order for "+quantity+" "+name+" has been places. Your total is: $"+price1);


    }
}
