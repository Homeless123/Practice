package day14_methods_tasks;

public class SalaryCalculator {
    /*
    Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0
     */
    public static void main(String[] args) {
        System.out.println(salary_mount(45,40));
        System.out.println(salary_year(45,40));
    }
    public static double salary_mount(double hours , int weakly){
        return hours*weakly;

    }
    public static double salary_year(double hours,int weakly){
        return hours*weakly*52;
    }
}
