package day03_variables;

public class FlightTicket {
    /*
1. Create a class named FlightTicket.java
2. Declare the following variables:
1. from
2. to
3. ticketPrice

3. Use concatenation to print the full ticket information
Ex:
From Las Vegas to McLean is $425.5

     */
    public static void main(String[] args) {
        String from="Las Vegas";
        String to="McLean";
        double ticketPrice=425.5;
        System.out.println("From "+from+"to "+to+" is $"+
                ticketPrice);
        System.out.println("----------------------");
        String From="Barcelona",
                To="Paris";
        double TicketPrice=150;
        System.out.println("From "+From+" to "+To+" is $"+TicketPrice);

    }
}
