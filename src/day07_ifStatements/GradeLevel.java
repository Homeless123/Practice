package day07_ifStatements;

public class GradeLevel {
    /*
    Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
     */
    public static void main(String[] args) {
        byte grade_level=17;
        boolean ValidGrade = (grade_level>=1 && grade_level<=18);
        String result="";
        if(ValidGrade){
            if(grade_level>=1 && grade_level<=5){
                result="Elementary school ";
            } else if (grade_level >= 6 && grade_level <= 8) {
                result="Middle school";
            }else if (grade_level >= 9 && grade_level <= 12) {
                result="High school";
            }else if (grade_level >= 13 && grade_level <= 16) {
                result="College";
            }else {
                result="Grad School";
            }
        }else {
            result="Invalid Grade";
        }
        System.out.println(result);
    }
}
