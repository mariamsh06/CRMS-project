import java.time.LocalDate;
/**
 * Represents the finalized record of renting a car in the CRMS
 * Extends ProcessedRecord class
 * Contains payment details and pickup details
 */


public class FinalizedRecord extends ProcessedRecord{
    PaymentDetails payment;
    PickupDetails pickup;

    /**
     * Constructor to create a FinalizedRecord object
     * @param client    The client making the booking
     * @param car       The car being requested
     * @param agent      The agent handling the booking
     * @param rentalDate   The date of the booking
     * @param rentalEndDate  The booking expiry date
     * @param baseCost      The cost of the booking
     * @param insurance     The vehicle insurance
     * @param discount      The booking discount
     * @param payment       The final booking payment
     * @param pickup        The booked cat pickup
     */

    public FinalizedRecord(Client client, Car car, Agent agent, LocalDate rentalDate,
                           LocalDate rentalEndDate, double baseCost,InsuranceOption insurance, Discount discount,
                           PaymentDetails payment, PickupDetails pickup) {
        super(client, car, agent, rentalDate, rentalEndDate, baseCost,
                insurance, discount); //calls ProcessedRecord constructor
        this.payment = payment;
        this.pickup = pickup;
    }

    //Getters
    public PaymentDetails getPayment(){
        return payment;
    }
    public PickupDetails getPickup(){
        return pickup;
    }

    //Setters
    public void setPayment(PaymentDetails payment){
        this.payment = payment;
    }
    public void setPickup(PickupDetails pickup){
        this.pickup = pickup;
    }
}
