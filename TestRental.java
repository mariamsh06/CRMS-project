/**
 * This class is used to test the CarRentalImplementer class.
 * It creates a CarRentalImplementer object, initializes the rental system,
 * and creates 2 bookings.
 * It then prints the bookings, the total costs, and the client names.
 */

public class TestRental {
    public static void main(String[] args) {
        CarRentalImplementer crms = new CarRentalImplementer();
        RentalSystem system = crms.initializeRentalSystem(1, 1, 2);

        System.out.println(system);
        Client client = system.getClients().get(0);  // the 1 client (index 0)
        Car    car    = system.getCars().get(0);      // the 1 car (index 0)
        Agent  agent1 = system.getAgents().get(0);   // first agent
        Agent  agent2 = system.getAgents().get(1);   // second agent

//step 2 create 2 bookings
        BookingRecord booking1 = crms.book(client, car, agent1); // book the car for the client with the first agent
        BookingRecord booking2 = crms.book(client, car, agent2); // book the car for the client with the second agent

        System.out.println(booking1); // print the first booking
        System.out.println(booking2);

        System.out.println("Booking 1 created for: " + booking1.getClient().getName());// print the first booking's client name
        System.out.println("Booking 2 created for: " + booking2.getClient().getName());// print the second booking's client name

        InsuranceOption insurance1 = new InsuranceOption("Standard", 30.0); // create the first insurance option
        Discount discount1 = new Discount("Loyalty", 10.0); // create the first discount
        double total1 = booking1.getBaseCost() + insurance1.getInsuranceAmount() - discount1.getDiscountAmount();

        InsuranceOption insurance2 = new InsuranceOption("Premium", 60.0); // create the second insurance option
        Discount discount2 = new Discount("None", 0.0); // create the second discount
        double total2 = booking2.getBaseCost() + insurance2.getInsuranceAmount() - discount2.getDiscountAmount();

        System.out.println("Booking 1 total cost: $" + total1); // print the first booking's total cost
        System.out.println("Booking 2 total cost: $" + total2); // print the second booking's total cost        



    }
}