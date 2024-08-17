package day06_ifStatement;

public class NumberToWord {
    /*
    Create a class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
     */
    public static void main(String[] args) {
        int number = 9;

        boolean ValidNumber = (number>=1 && number<=9);

        if (ValidNumber) {
            if (number == 9) {
                System.out.println("Nine");
            } else if (number==8) {
                System.out.println("Eight");
            }else if (number==7) {
                System.out.println("Seven");
            }else if (number==6) {
                System.out.println("Six");
            }else if (number==5) {
                System.out.println("Five");
            }else if (number==4) {
                System.out.println("Four");
            }else if (number==3) {
                System.out.println("Three");
            }else if (number==2) {
                System.out.println("Two");
            }else {
                System.out.println("One");
            }

        } else {
            System.out.println("Invalid Number");
        }


    }
}
