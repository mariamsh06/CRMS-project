/**
 * Class to represent the branch location of an agent's workplace
 * contains the agent's branch location
 */
public class Branch {
    String location;

    /**
     * Constructor to create a Branch object.
     * @param location   The branch location where the agent works
     */
    public Branch (String location){
        this.location = location;
    }

    //Getters
    public String getLocation(){
        return location;
    }

    //Setters
    public void setLocation(String location){
        this.location = location;
    }
}
