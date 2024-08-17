package day07_ifStatements;

public class SpeedCheck {

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
    public static void main(String[] args) {
        int speedLimit = 104;

        String speed="";

        if (speedLimit>=1&& speedLimit>=105) {


            if (speedLimit < 50) {
                speed = "You're driving 50 mph under the limit. Be fast!";
            } else if (speedLimit < 100) {
                speed = "You're driving 50 mph over the limit. Slow down!";
            }
            System.out.println(speed);


        }else {
            System.out.println("Cops behind to you."+speed);
        }

    }
}
