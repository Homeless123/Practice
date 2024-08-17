package day06_ifStatement;

public class MedianNumber {
    /*
    Create a class named MedianNumber. write a program that can find
    the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
     */
    public static void main(String[] args) {
        int a =10,
                b=15,
                c=8;
        boolean a_is_median_number = (c>a && a>b)||(a>c && a<b);
        boolean b_is_median_number = (b>a && b<c)||(b<a && b>c);
        boolean c_is_median_number = !a_is_median_number && !b_is_median_number;

        if (a_is_median_number) {
            System.out.println(a+" is the median number");
        } else if (b_is_median_number) {
            System.out.println(b+" is the median number");
        }else{
            System.out.println(c+" is the median number");
        }



    }
}
