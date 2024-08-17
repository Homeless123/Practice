package day11_String;

import java.util.Scanner;

public class WithoutFirstChar {
   /*
   Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
    */
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the First string: ");
       String fistWord = sc.nextLine();
       System.out.println("Enter the Second string: ");
       String secondWord = sc.nextLine();
       String result = fistWord.substring(1) + secondWord.substring(1);
       System.out.println(result);



   }
}
