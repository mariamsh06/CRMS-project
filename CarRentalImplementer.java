import java.util.ArrayList;
import java.time.LocalDate;

/**
 * implementation of the CRMS interface.
 * handles the full car rental process which is: initializing the system,
 * booking a car, processing the booking, and finalizing the rental.
 */
/**
 * implements here means that it MUST provide code for all methods in interface (4) or else it wont compile
 * */
public class CarRentalImplementer implements CRMS {

    /**
     * sets up the rental environment by creating sample clients, cars, and agents.
     * @param numOfClients  number of clients to create
     * @param numOfCars     number of cars to create
     * @param numOfAgents   number of agents to create
     * @return returns a rentalsystem containing the given specs (check the pdf for task 3 specs men el prof)
     */
    @Override
    public RentalSystem initializeRentalSystem(int numOfClients, int numOfCars, int numOfAgents) {

        ArrayList<Client> clients = new ArrayList<>();
        for (int i = 1; i <= numOfClients; i++) {
            LicenseDetails license = new LicenseDetails(
                    "Client " + i,
                    "None",
                    "EGY-" + (1000 + i),
                    "2028-01-01"
            );
            ContactDetails contact = new ContactDetails(
                    i + " Abbas Main Street",
                    700000000 + i,
                    "client" + i + "@gmail.com"
            );
            clients.add(new Client("Client " + i, license, contact));
        }

        ArrayList<Car> cars = new ArrayList<>();
        String[] categories = {"Economy", "SUV", "Luxury", "Sedan"};
        for (int i = 1; i <= numOfCars; i++) {
            String category = categories[(i - 1) % categories.length];
            Features features = new Features("Petrol", category, "Automatic", 5);
            InsuranceDetails insuranceDetails = new InsuranceDetails(
                    "AXA Insurance",
                    "Third Party",
                    "Crash Protection"
            );
            cars.add(new Car(features, insuranceDetails, "CAR-" + (100 + i), 50.0 * i));
        }

        ArrayList<Agent> agents = new ArrayList<>();
        String[] locations = {"Cairo", "Alexandria", "Aswan", "Luxor"};
        for (int i = 1; i <= numOfAgents; i++) {
            Branch branch = new Branch(locations[(i - 1) % locations.length]);
            Schedule schedule = new Schedule(8, "Sun-Fri 9am-5pm");
            agents.add(new Agent(branch, schedule));
        }

        return new RentalSystem(clients, cars, agents);
    }

    /**
     * creates a BookingRecord connecting the client, car, and agent
     * the rental duration defaults to 3 days from today, and the base cost
     * is calculated from the car's daily base rate.
     * @param c    client making the booking
     * @param car  car being rented
     * @param a    agent handling the booking
     * @return returns a BookingRecord with all booking details
     */
    @Override
    public BookingRecord book(Client c, Car car, Agent a) {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(3);
        double baseCost = car.getBaseRate() * 3; // 3 day rental

        return new BookingRecord(c, car, a, startDate, endDate, baseCost);
    }

    /**
     * processes the booking by applying an insurance option and a discount
     * the total cost is recalculated as: baseCost + insuranceAmount - discountAmount.
     * the processed record's base cost is updated to reflect the final price.
     * @param br   BookingRecord to process
     * @return returns a ProcessedRecord with insurance and discount applied
     */
    @Override
    public ProcessedRecord process(BookingRecord br) {
        InsuranceOption insurance = new InsuranceOption("Standard", 30.0);
        Discount discount = new Discount("Loyalty", 10.0);

        double totalCost = br.getBaseCost() + insurance.getInsuranceAmount() - discount.getDiscountAmount();

        ProcessedRecord pr = new ProcessedRecord(
                br.getClient(),
                br.getCar(),
                br.getAgent(),
                br.getRentalDate(),
                br.getRentalEndDate(),
                totalCost,
                insurance,
                discount
        );

        return pr;
    }

    /**
     * finalizes the rental by confirming payment and pickup details
     * a deposit of 20% of the total cost is applied, and the outstanding
     * balance is the remaining 80%. and the pickup is arranged at the agent's branch.
     * @param pr  ProcessedRecord to finalize
     * @return returns a FinalizedRecord confirming all rental terms
     */
    @Override
    public FinalizedRecord finalize(ProcessedRecord pr) {
        double totalCost = pr.getBaseCost();
        double deposit = totalCost * 0.20;
        double outstanding = totalCost - deposit;

        PaymentDetails payment = new PaymentDetails(deposit, totalCost, outstanding);

        String pickupBranch = pr.getAgent().getBranch().getLocation();
        String pickupDate = pr.getRentalDate().toString();
        PickupDetails pickup = new PickupDetails(pickupBranch, "Please do not forget your driver's license", pickupDate);

        return new FinalizedRecord(
                pr.getClient(),
                pr.getCar(),
                pr.getAgent(),
                pr.getRentalDate(),
                pr.getRentalEndDate(),
                pr.getBaseCost(),
                pr.getInsuranceOption(),
                pr.getDiscount(),
                payment,
                pickup
        );
    }
}
