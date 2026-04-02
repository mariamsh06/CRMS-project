/**
 * this class is used to test the CarRentalImplementer class.
 * it creates a CarRentalImplementer object, initializes the rental system,
 * and creates 2 bookings.
 * it then prints the bookings, the total costs, and the client names.
 */
public class TestRental {
    public static void main(String[] args) {
        CarRentalImplementer crms = new CarRentalImplementer();

        // step 1: initialize with 1 client, 1 car, 2 agents
        RentalSystem system = crms.initializeRentalSystem(1, 1, 2);
        Client client = system.getClients().get(0);  // the 1 client (index 0)
        Car car       = system.getCars().get(0);      // the 1 car (index 0)
        Agent agent1  = system.getAgents().get(0);    // first agent
        Agent agent2  = system.getAgents().get(1);    // second agent

        // step 2: create 2 bookings
        BookingRecord booking1 = crms.book(client, car, agent1); // book the car for the client with the first agent
        BookingRecord booking2 = crms.book(client, car, agent2); // book the car for the client with the second agent
        System.out.println("Booking 1 for: " + booking1.getClient().getName());
        System.out.println("Booking 2 for: " + booking2.getClient().getName());

        // step 3: process both with different insurance and discount terms
        ProcessedRecord processed1 = crms.process(booking1); // Standard insurance, Loyalty discount
        ProcessedRecord processed2 = crms.process(booking2);
        // override processed2 because process method only takes 1 parameter (br) and not discount or insurance
        processed2.setInsuranceOption(new InsuranceOption("Premium", 60.0));
        processed2.setDiscount(new Discount("None", 0.0));
        double newTotal = processed2.getBaseCost() - 20.0 + 60.0; // remove original terms, add new ones
        processed2.setBaseCost(newTotal);

        System.out.println("Booking 1. Insurance: " + processed1.getInsuranceOption().getInsuranceType()
                + ". Discount: " + processed1.getDiscount().getDiscountType()
                + ". Total Cost: $" + processed1.getBaseCost());
        System.out.println("Booking 2. Insurance: " + processed2.getInsuranceOption().getInsuranceType()
                + ". Discount: " + processed2.getDiscount().getDiscountType()
                + ". Total Cost: $" + processed2.getBaseCost());

        // step 4: compare our costs to find the best deal
        double total1 = processed1.getBaseCost();
        double total2 = processed2.getBaseCost();

        System.out.println("COMPARING DEALS:");
        if (total1 < total2) {
            // booking 1 is better (cheaper)
            System.out.println("Booking 1 is the better deal at $" + total1);
        } else if (total2 < total1) {
            // booking 2 is better (cheaper)
            System.out.println("Booking 2 is the better deal at $" + total2);
        } else {
            // costs are equal
            System.out.println("Both bookings cost the same: $" + total1);
        }

        // step 5: finalize the booking with the lower total cost
        ProcessedRecord betterDeal = (total1 <= total2) ? processed1 : processed2;
        FinalizedRecord finalized = crms.finalize(betterDeal);

        // printing the finalized rental info
        System.out.println("FINALIZED BOOKING:");

        // print payment info and deposit info
        System.out.println("Deposit: $" + finalized.getPayment().getDeposit());
        System.out.println("Total Cost: $" + finalized.getPayment().getRentalCost());
        System.out.println("Outstanding Balance: $" + finalized.getPayment().getOutstandingBalance());

        // print pick uo info and branch details
        System.out.println("Pickup Branch: " + finalized.getPickup().getPickupBranch());
        System.out.println("Pickup Date: " + finalized.getPickup().getDate());
        System.out.println("Special Instructions: " + finalized.getPickup().getSpecialInstruction());
    }
}
