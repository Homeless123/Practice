package day17_customClass;
/*
Create a custom class named Address with the following attributes and actions:

      Attributes:
            buildingNumber (int): used to store the building number of the address.
            street (String): used to store the street of the address.
            city (String): used to store the city of the address.
            state (String): used to store the state abbreviations of the address.
            zipCode (String): used to store the zip code of the address.

      Actions:
            toString(): returns the string representation of the address object in the following format:

                  Example:
                      buildingNumber = 7925;
                      street = "Jones Branch Dr";
                      city = "McLean";
                      state = "VA";
                       zipCode = 22012;

                  Output:
                        7925 Jones Branch Dr
                        McLean Va, 22012

       Create another class named AddressClients, create multiple address objects, and test each function of the address object.

 */
public class Address {

    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public String zip;


    public void Address(int buildingNumber, String street, String city, String state, String zip) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString() {
        return "\t"+buildingNumber+" "+street+"\n\t"+city+" "+state+" "+zip;
//        return "Address{" +
//                "buildingNumber=" + buildingNumber +
//                ", street='" + street + '\'' +
//                ", city='" + city + '\'' +
//                ", state='" + state + '\'' +
//                ", zip='" + zip + '\'' +
//                '}';
    }
}

