package day03_variables;

public class FullName {
    /*
    1. Create a class named FullName.java
    2. Declare the following variables:
        1. firstName
        2. lastName

    3. Use concatenation to print the full name
        Ex:
        Your full name is Daniel Jefferson
     */
    public static void main(String[] args) {
        String FristName = "Daniel";
        String LastName = "Jefferson";
        String FullName = FristName + " " + LastName;
        System.out.println("Your full name is" + FullName);
    }

}
