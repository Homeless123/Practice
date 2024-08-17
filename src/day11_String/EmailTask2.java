package day11_String;

import java.util.Scanner;

public class EmailTask2 {
    /*
    Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address: ");
        String email = sc.nextLine();
        sc.close();
        String firstname = email.substring(0, email.indexOf("_"));
        String lastname = email.substring(1+email.indexOf("_"),email.lastIndexOf("@"));
        String domain = email.substring(0+email.indexOf("@"),email.lastIndexOf("."));
        System.out.println("First name: " + firstname.substring(0,1).toUpperCase()+firstname.substring(1) );
        System.out.println("Last name: "+lastname.substring(0,1).toUpperCase()+lastname.substring(1) );
        System.out.println("Domain: "+domain.substring(1) );



    }

//
//        String firstName = email.substring(0, email.indexOf("_"));
//        System.out.println(firstName.substring(0, 1).toUpperCase()+firstName.substring(1));
//        String lastName = email.substring(6,email.indexOf("@"));
//        System.out.println(lastName.substring(0,1).toUpperCase()+lastName.substring(1));
//        String domain = email.substring(email.indexOf("@")+1);
//        System.out.println(domain.substring(email.indexOf("@")+1,email.lastIndexOf(".")));
//    }
}
