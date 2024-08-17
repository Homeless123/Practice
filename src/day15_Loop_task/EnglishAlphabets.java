package day15_Loop_task;
/*
 Create a class named EnglishAlphabets, and write a program that displays alphabet letters from A to Z in the
same line separated by a space.
 */
public class EnglishAlphabets {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.print(i + " ");
        }
    }
}
