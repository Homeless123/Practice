package day09_scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        /*
        Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of score: ");
        int score = sc.nextInt();
        String grade ="";
        if (score >= 85 && score <= 100) {
            grade = "A";
        }else if (score >= 70 && score <= 85) {
            grade = "B";
        }else if (score >= 55 && score <= 70) {
            grade = "C";
        } else if (score >= 45 && score <= 55) {
            grade = "D";
        }else if (score >= 0 && score <= 45) {
            grade = "F";
        }else {
            grade = "Invalid Score";
        }
        System.out.println(grade);
    }



}
