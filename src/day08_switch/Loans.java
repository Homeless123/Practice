package day08_switch;

public class Loans {
    /*
    Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approved for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise, print: "Loan Denied"

              NOTE: MUST USE TERNARY.
     */
    public static void main(String[] args) {

        double salary=850000,
                CreditScore=690;
String result=(salary>=60000)&&(CreditScore>=650)?"Loan Approved"
        :"Loan Rejected";
        System.out.println(result);
    }
}
