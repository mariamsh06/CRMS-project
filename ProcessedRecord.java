import java.time.LocalDate;
/**
 * Extends the BookingRecord class with additional processing details
 * Contains insuranceOptions and Discount
 */
public class ProcessedRecord extends BookingRecord {
   InsuranceOption insurance;
   Discount discount;

   /**
    * Constructor to create a processedRecord object.
    * @param client    The client making the booking
    * @param car       The car being requested
    * @param agent      The agent handling the booking
    * @param rentalDate   The date of the booking
    * @param rentalEndDate  The booking expiry date
    * @param baseCost      The cost of the booking
    * @param insurance     The vehicle insurance
    * @param discount      The booking discount
    */
   public ProcessedRecord(Client client, Car car, Agent agent, LocalDate rentalDate,
                          LocalDate rentalEndDate, double baseCost,InsuranceOption insurance, Discount discount){
      super(client, car, agent, rentalDate, rentalEndDate,baseCost); //calls bookingRecord constructor
      this.insurance = insurance;
      this.discount = discount;
   }
   //Getters
   public InsuranceOption getInsuranceOption(){
      return insurance;
   }
   public Discount getDiscount(){
      return discount;
   }

   //setters
   public void setInsuranceOption(InsuranceOption insurance){
      this.insurance = insurance;
   }
   public void setDiscount(Discount discount){
      this.discount = discount;
   }


}
