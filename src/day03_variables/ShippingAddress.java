package day03_variables;

public class ShippingAddress {
    /*
    Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode

3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger
13621A Legacy Circle
Fairfax, VA 22030
     */

    public static void main(String[] args) {
        String name = "Aaron Kissinger",
                streetName="Legacy Circle",
                city="Fairfax",
                state="VA",
         buildingNumber="13621A",
                postalCode="22030";
        System.out.println("Your Shipping address is:");
        System.out.println("\t"+name);
        System.out.println("\t"+buildingNumber+" "+streetName);
        System.out.println("\t"+city+", "+state+" "+postalCode);
        System.out.println("----------------------------------");
        System.out.println("Your Shipping address is:"+"\n\t"+name+"\n\t"
                        +buildingNumber+", "+streetName+"\n\t"+city+", "
                +state+", "+postalCode);



    }
}
