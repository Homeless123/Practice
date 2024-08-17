package day12_customMethods;

public class capitalization {
    /*
    Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
     */
    public static void main(String[] args) {
        capitalize("cyDeO", "sCHooL");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first name: ");
//        String firstName = sc.nextLine();
//        System.out.println("Enter your last name: ");
//        String lastName = sc.nextLine();
//        String fullName = firstName + " " + lastName;
//
//
//        System.out.println(firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase()+" "+lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase());
    }
    public static void capitalize(String firstname, String lastname) {
       // Scanner sc = new Scanner(System.in);

        firstname =firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();

        lastname =lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
        System.out.println(firstname+" "+lastname);
    }
}
