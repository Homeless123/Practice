package day11_String;

public class ReplaceX {
    /*
    Create a class named ReplaceX, and write a program that asks a user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
     */
    public static void main(String[] args) {
        String str ="xcodex";

        str =str.replaceAll("x","a");

        System.out.println(str);




    }
}
