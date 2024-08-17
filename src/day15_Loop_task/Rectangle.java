package day15_Loop_task;
/*
Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *

 */
public class Rectangle {
    public static void main(String[] args) {
        String str ="\t\t\t"+"* * * * * * * *";
        for (int i = 0; i < 9; i++) {
            System.out.println(str);

        }
    }
}
