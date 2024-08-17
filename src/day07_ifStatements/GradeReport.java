package day07_ifStatements;

public class GradeReport {
    /*
    Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
     */
    public static void main(String[] args) {

        System.out.println("Miguel Delgado Rosa ");

        int score=69;

        if (score>=1 && score<=100) {
            if (score>=85)
                System.out.println("A");
            else if (score>=70) {
                System.out.println("B");
            }else if (score>=60) {
                System.out.println("C");
            }else if (score>=45) {
                System.out.println("D");
            }else {
                System.out.println("F");
            }
        }else {
            System.out.println("invalid grade");
        }
        System.out.println(score);


    }
}
