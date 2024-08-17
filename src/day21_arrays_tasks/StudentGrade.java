package day21_arrays_tasks;
/*
Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */
public class StudentGrade {
    public static void main(String[] args) {

        // Given two arrays with the same length:   1) studentNames (String[]) 2) scores (int[])
        String[] studentsNames = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        // Write a program to determine and store the students' grades in an array of characters named grades.
        char[] grades = new char[studentsNames.length];
        for (int i = 0; i < grades.length; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
            System.out.println(studentsNames[i] + "'s score is " + scores[i]+", and grade is " + grades[i]);
        }


        for (int i = 0; i < studentsNames.length; i++) {
            System.out.print(studentsNames[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]+"\s\s\s\s\s");
        }
        System.out.println();




    }
}


