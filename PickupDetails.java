/**
 * Represents the pickup details of a car in the CRMS
 * Contains pickup branch, date and special instructions
 */
public class PickupDetails {
    String pickupBranch;
    String  specialIns; //special instructions
    String date;

    /**
     * Constructor to create a PickupDetails object
     * @param pickupBranch   The branch to pick up the car
     * @param specialIns     Any special instructions with regard to car pick up
     * @param date           The date for pickup
     */

    public PickupDetails(String pickupBranch, String specialIns, String date){
        this.pickupBranch = pickupBranch;
        this.specialIns = specialIns;
        this.date = date;
    }

    //Getters
    public String getPickupBranch(){
        return pickupBranch;
    }
    public String getSpecialInstruction(){
        return specialIns;
    }
    public String getDate(){
        return date;
    }

    //setters
    public void setPickupBranch(String pickupBranch){
        this.pickupBranch = pickupBranch;
    }
    public void setSpecialInstruction(String specialIns){
        this.specialIns =specialIns;
    }
    public void setDate(String date){
        this.date = date;
    }

}
