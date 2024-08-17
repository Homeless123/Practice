package day24_wrapper_classes_arraylist;
/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */

import java.util.ArrayList;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        String letters ="";
        String digits ="";
        String specialChars ="";

        for (char strChar : str.toCharArray()) {
            if (Character.isLetter(strChar)) {
                letters += strChar;
            } else if (Character.isDigit(strChar)) {
                digits += strChar;
            }else {
                specialChars += strChar;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
