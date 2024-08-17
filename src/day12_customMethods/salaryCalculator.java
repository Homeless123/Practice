package day12_customMethods;

public class salaryCalculator {
    /*
     Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
     */
    public static void main(String[] args) {
salaryCalculator(45,40);


    }


    public static void salaryCalculator(double hourlyRate , int weeklyHours) {

        double salary = hourlyRate * weeklyHours*52;
        System.out.println("You make "+hourlyRate+" per hour");
        System.out.println("You work "+weeklyHours+" in a weak");
        System.out.println("Your gross income is $"+salary);
    }

}

