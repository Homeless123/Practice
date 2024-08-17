package day06_ifStatement;

public class WeekDays {
    public static void main(String[] args) {

        int day =4;
        String dayString = "";
        if(day == 1){
           dayString=("Monday");
        }
        else if(day == 2){
            dayString=("Tuesday");
        }
        else if(day == 3){
            dayString=("Wednesday");
        }
        else if(day == 4){
           dayString=("Thursday");
        }
        else if(day == 5){
            dayString=("Friday");
        }
        else if(day == 6){
            dayString=("Saturday");
        }
        else if(day == 7){
            dayString=("Sunday");
        }
        System.out.println(dayString);
    }
    /*
    An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents

Ex:
Given:
number = 1

output:
Monday

Hint: Assume that a number between 1 ~ 7 is given to the variable
     */
}
