package day11_String;

import java.util.Scanner;

public class CombineWords {
    /*
    Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word1 = sc.nextLine();
        System.out.println("Enter word: ");
        String word2 = sc.nextLine();
        String result="";

        if(word1.charAt( word1.length()-1) == word2.charAt(0)){
            result = word1+ word2.substring(1);
        }else{
            result = word1+word2;
        }

        System.out.println(result);

        sc.close();



//        String result=word1+word2.substring(1);
//        System.out.println(result);

    }
}
