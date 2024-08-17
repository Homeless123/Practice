package day14_methods_tasks;

public class MaximumAndMinimum {
    /*
    Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100
     */
    public static void main(String[] args) {
        System.out.println(min(10.5,30.5));
        System.out.println(max(10.5,30.5));
        System.out.println(max(100,200));
        System.out.println(min(100,200));
    }
    public static int max (int number1, int number2) {
        return number1 > number2 ? number1:number2;
    }
    public static double max (double number1, double number2) {
        return number1 > number2 ? number1:number2;
    }
    public static int min (int number1, int number2) {
        return number1 < number2 ? number1:number2;
    }
    public static double min (double number1, double number2) {
        return number1 < number2 ? number1:number2;
    }
}
