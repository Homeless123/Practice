package day15_Loop_task;
/*
Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i < 5; i++) {

                       num *= i;

        }

        System.out.println(num);

        System.out.println("*************");
        int number= 5;
        int factorial = 1;

        while(number > 1){
            System.out.print(number + " * ");
            factorial *= number--; // factorial = factorial * num
        }

        System.out.println();
        System.out.println(factorial);


    }
}
