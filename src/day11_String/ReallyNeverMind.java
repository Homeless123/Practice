package day11_String;

import java.util.Scanner;

public class ReallyNeverMind {
    /*
    Create a class named ReallyNeverMind.
    Ask the user to enter a word.
    if the word ends with "ly", print "really???",
    otherwise, print "never mind"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String word ="";
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        String lastToWord = word.substring( word.length()-2);
        if(lastToWord.equals("ly")){
            System.out.println("really ???");
        }else {
            System.out.println("never mind");
        }
        sc.close();
    }
}
