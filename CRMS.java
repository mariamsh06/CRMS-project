/**
 * interface for crms
 * i got the four methods from the part 2 pdf
 *
 */
public interface CRMS {

    /**
     * this method is to initialize the rental system, u need to input a number of cars,clients,agents for
     * it to work
     * @param numOfClients  number of clients to initiate
     * @param numOfCars     number of cars to initiate
     * @param numOfAgents   num of agents to initiate
     * @return returns a rental system (object) with clients,cars,agents listed
     */
    RentalSystem initializeRentalSystem(int numOfClients, int numOfCars, int numOfAgents);

    /**
     * handles the initial booking of a car by a client w managed by an agent.
     * @param c    the client thats making the car booking
     * @param car  the car thats being rented
     * @param a    the agent thats gonna be handling the booking
     * @return a booking record containing details of all three params
     */
    BookingRecord book(Client c, Car car, Agent a);

    /**
     * processes a booking record by applying insurance, discounts, and branch policies
     * @param br  takes the booking record
     * @return returns a proccessed record with updated cost and conditions
     */
    ProcessedRecord process(BookingRecord br);

    /**
     * finalizes the rental by confirming payment and pickup arrangements.
     * @param pr  takes processed record to finalize
     * @return a finalized record confirming the client's rental agreement
     */
    FinalizedRecord finalize(ProcessedRecord pr);
}
