package day14_methods_tasks;

public class OddAndEven {
    public static void main(String[] args) {

        System.out.println(isEven(100));
        System.out.println(isOdd(200));
        System.out.println(isEven(5));
        System.out.println(isOdd(6));
        System.out.println(isEven(6));
//        if (number % 2 == 0) {
//            System.out.println(number + " is even");
//        }else {
//            System.out.println(number + " is odd");
//        }



    }
    public static boolean isOdd(int number) {
       return number % 2 ==1;

        }
        public static boolean isEven(int number) {
        return number % 2 == 0;
        }
    }
    /*
    1. Create a class named OddAndEven:

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true

     */


