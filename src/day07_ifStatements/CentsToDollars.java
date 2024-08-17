package day07_ifStatements;

public class CentsToDollars {
    /*
    Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
     */
    public static void main(String[] args) {


        int cents = 225;

        int cent= cents%100;

        int dollar =cents /100;


        System.out.println(cents+" cents equal to: "+dollar+" dollars and "+cent+" cents");
}
}
