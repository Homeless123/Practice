package day01_printStatement;
import java.util.Scanner;
public class asdasd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        String lastTwoChars = word.substring( word.length()-2 );

        if(lastTwoChars.equals("ly")){
            System.out.println("really???");
        }else{
            System.out.println("Never mind");
        }

        scan.close();
    }
}
