/**
 * Class to represent an agent in the Car Rental Management System
 * Contains information about the agent's branch and schedule
 */
public class Agent {
    Branch branch;
    Schedule schedule;
/**
 * Constructor to create an Agent object.
 * @param branch    The agent's branch
 * @param schedule  The agent's schedule
  */

    public Agent(Branch branch, Schedule schedule){
    this.branch = branch;
    this.schedule = schedule;
    }

    //Getters
    public Branch getBranch(){
        return branch;
    }
    public Schedule getSchedule(){
        return schedule;
    }

    //Setter
    public void setBranch(Branch branch){
        this.branch = branch;
    }
    public void setSchedule(Schedule schedule){
        this.schedule = schedule;
    }

}



