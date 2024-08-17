package day08_switch;

public class NumberToWord {
    public static void main(String[] args) {
        /*
        Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary

         */

        int number = 8;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }

        System.out.println("-----------------------------");

        String result ="Invalid";

        if (number>=1&&number<=9) {
            result = (number == 1) ? "One" : (number == 2) ? "Two" : (number == 3) ? "Three" :
                    (number == 4) ? "Four" : (number == 5) ? "Five":(number == 6) ? "Six" : (number == 7) ? "Seven"
                    : (number == 8) ? "Eight" : "Nine";
        }
        System.out.println(result);



    }

}
