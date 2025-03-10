package day04_concatenation;

public class SalaryCalculator {
    /*
    Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560
     */

    public static void main(String[] args) {

       double hourlyRate=50,
               weeklyHours=45,
               stateTax=6,
               federalTax=26;

       //----------------------\\
        double salaryBeforeTax=weeklyHours*52*hourlyRate,
                stateTaxAfter=salaryBeforeTax*stateTax/100,
                federalTaxAfter=salaryBeforeTax*federalTax/100,
                totalTax= stateTaxAfter+federalTaxAfter,
                salaryAfterTax=salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("Federal tax is: $"+federalTaxAfter);
        System.out.println("State tax is: $"+stateTaxAfter);
        System.out.println("Total tax is: $"+totalTax);
        System.out.println("Net income is: $"+salaryAfterTax);





       }


    }

