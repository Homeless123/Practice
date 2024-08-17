package day15_Loop_task;
/*
Create a class named FINRA. and write a program that prints the numbers from 1 to 100. For numbers that
are multiples of both 3 and 5, print "FINRA" instead of the number. For numbers that are multiples of 3, print
"FIN" instead of the number, and for numbers that are multiples of 5, print "RA" instead of the number.

				Example:
					1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN...
 */
public class FINRA {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            boolean divideBy3 = i % 3 == 0;
            boolean divideBy5 = i % 5 == 0;
            String result = "";
            if (divideBy5 && divideBy3) {
                result ="FINRA";
            }else if (divideBy3) {
                result ="FIN";
            }else if (divideBy5) {
                result ="RA";
            }else {
                result =""+i;
            }
            System.out.print(" "+result);

        }


    }
}
