package day11_String;

public class StartsWithX {
    /*
    Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
     */
    public static void main(String[] args) {

        String word ="xcodex";

       if (word.charAt(0)=='x'){
           System.out.println(word.replaceFirst("x","a"));
       }








    }}
