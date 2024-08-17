package day14_methods_tasks;
/*
Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */
public class DayAndMonth {
    public static void main(String[] args) {
        System.out.println(day(5));
        System.out.println(monthName(6));
        System.out.println(daysInMonth(6));

    }
    public static int day(int number) {

        String result = switch (number){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Number.";

        };
        System.out.println(result);


        return number;
    }
    public static int monthName(int number) {
        String result = "";
        switch (number){
            case 1 -> result = "January";
            case 2 -> result = "February";
            case 3 -> result = "March";
            case 4 -> result = "April";
            case 5 -> result = "May";
            case 6 -> result = "June";
            case 7 -> result = "July";
            case 8 -> result = "August";
            case 9 -> result = "September";
            case 10 -> result = "October";
            case 11 -> result = "November";
            case 12 -> result = "December";
            default -> result = "Invalid Number.";
        };

        System.out.println(result);
        return number;
    }
    public static int daysInMonth(int number){
        int result = 0;
        switch (number){
            case 2 -> result = 28;
            case 1,3,5,7,8,10,12 -> result = 31;
            case 4,6,9,11 -> result = 30;
            default -> result = 0;
        }
        System.out.println("result = " + result+monthName(result));
        return result;

    }

}
