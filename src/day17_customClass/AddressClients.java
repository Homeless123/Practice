package day17_customClass;

public class AddressClients {
    public static void main(String[] args) {
        Address address =new Address();
        address.Address(7925,"Jones Branch Dr","McLean","VA","2001");
        System.out.println(address);
        System.out.println("------------------------------------");
        Address address1 = new Address();
        address1.Address(123,"Main","Springfield","IL","62701");
        System.out.println(address1);
        System.out.println("************************************");
        Address address2 = new Address();
        address2.Address(456,"Elm St","Aurora","IL","60502");
        System.out.println(address2);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        Address address3 = new Address();
        address3.Address(300,"Hidden Figures Way SW","Washington","D.C","32899");
        System.out.println(address3);



    }
}
