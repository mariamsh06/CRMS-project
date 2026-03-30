/**
 * Class to represent an agent's schedule in the CRMS
 * Contains agent's working hours and availability
 */
public class Schedule {
    int workingHours;
    String availability;

    /**
     * Constructor to create a Schedule object
     * @param workingHours   The agent's working hours
     * @param availability   The agent's availability for bookings
     */
    public Schedule(int workingHours, String availability){
        this.workingHours = workingHours;
        this.availability = availability;
    }

    //Getters
    public int getWorkingHours(){
        return workingHours;
    }
    public String getAvailability(){
        return availability;
    }

    //Setters
    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }
    public void setAvailability(String availability){
        this.availability = availability;
    }

}

