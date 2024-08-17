package day09_scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        /*
        Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currently speed: ");
        int speed = input.nextInt();
        System.out.println("The current speed is " + speed);
        String result= "";

        if (speed > 50) {
        result ="You're driving 50 mph over the limit. Slow down!";
        }else if (speed < 50&& speed > 20) {
            result="You're driving "+speed+" mph average  the limit.";

        }else {
            result = "You're driving 20 mph under the limit. Be fast!";
        }
        System.out.println(result);
    }

}
