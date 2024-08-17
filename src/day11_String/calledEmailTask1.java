package day11_String;

public class calledEmailTask1 {
    /*
     Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
     */
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";

       String fisrtName = email.substring(0 ,email.indexOf("_"));
        System.out.println("First name=> "+fisrtName);
       String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        System.out.println("Last name=> "+lastName);
        String all = email.substring(email.indexOf("@")+1);
        System.out.println(all);
        System.out.println(email);



    }}
