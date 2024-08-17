package day09_scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        /*
        Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

         */
        Scanner input = new Scanner(System.in);
        System.out.println("How many total shares you have already?");
        int share = input.nextInt();
        String result="Invalid number of shares";

        if(share>0){
            System.out.println("How much is your total value in the stock market ?");
            double totalShare =input.nextDouble();
            System.out.println("Enter the name of the company that you have the most shares in");
            String companyName = input.next();
            result="Your total stock market holding is "+totalShare+"which is made up of "+companyName+" is your company holdings";

        }else {
            result="Invalid information";
        }
        System.out.println(result);
    }
}
