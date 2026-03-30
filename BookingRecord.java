import java.time.LocalDate;
/**
 * Class to represent a booking done within the Car Rental Management System
 * Contains details about the booking(client, car, agent,
 */
public class BookingRecord {
    Client client;
    Car car;
    Agent agent;
    LocalDate rentalDate;
    LocalDate rentalEndDate;
    double baseCost;
    /**
     * Constructor to create a BookingRecord object.
     * @param client   The client making the booking
     * @param car      The car being requested
     * @param agent    The agent handling the booking
     * @param rentalDate   The date of the booking
     * @param rentalEndDate  The booking expiry date
     * @param baseCost;      The cost of the booking
     */
    public BookingRecord(Client client, Car car, Agent agent, LocalDate rentalDate, LocalDate rentalEndDate, double baseCost){
        this.client = client;
        this.car = car;
        this.agent = agent;
        this.rentalDate= rentalDate;
        this.rentalEndDate = rentalEndDate;
        this.baseCost = baseCost;
    }
    //Getters
    public Client getClient(){
        return client;
    }
    public Car getCar(){
        return car;
    }
    public Agent getAgent(){
        return agent;
    }
    public LocalDate getRentalDate(){
        return rentalDate;
    }
    public LocalDate getRentalEndDate(){
        return rentalEndDate;
    }
    public double getBaseCost(){
        return baseCost;
    }

    //Setters
    public void setClient(Client client){
        this.client = client;
    }
    public void setCar(Car car){
        this.car = car;
    }
    public void setAgent(Agent agent){
        this.agent = agent;
    }
    public void setRentalDate(LocalDate rentalDate){
        this.rentalDate = rentalDate;
    }
    public void setRentalEndDate(LocalDate rentalEndDate){
        this.rentalEndDate = rentalEndDate;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }


}
