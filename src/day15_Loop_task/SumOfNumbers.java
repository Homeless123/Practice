package day15_Loop_task;
/*
Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100

				Output:
					  5050


				Example 2:
					    number = 50

				Output:
					  1275


 */
public class SumOfNumbers {
    public static void main(String[] args) {
        int number = 101;
        int sum = 0;


        for(int i = 1; i < number; i++){
            sum += i;
        }


        System.out.println(sum);

        int number2 = 51;
        int sum2 = 0;

        for(int i = 1; i < number2; i++){
            sum2 += i;
        }
        System.out.println(sum2);
    }
}
