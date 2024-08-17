package day07_ifStatements;

public class AgeGroups {
    /*
     Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

     */
    public static void main(String[] args) {

        int age = 95;

        String result="";

        boolean ValidAge = age >= 1 && age <= 150;

        if (ValidAge) {
            if (age >= 1 && age <= 21) {
                result = "Teenager";
            }else if (age >= 21 && age <= 55) {
                result="Adult";
            }else {
                result="Senior";
            }

        }else{
            result = "Invalid Age or You forget to die ";
        }
        System.out.println(result);


    }
}
