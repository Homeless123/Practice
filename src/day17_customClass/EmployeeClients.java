package day17_customClass;
public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Hugo",21,'M',"Developer",23000);

        Employee employee2 = new Employee();
        employee2.setInfo("Igor",26,'M',"Back-End Tester",25000);

        System.out.println(employee1);
        System.out.println(employee2);


        employee1.work();
        employee2.work();


    }
}
