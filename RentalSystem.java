import java.util.ArrayList;

/**
 * Class to the Car Rental Management System
 * Contains the attributes involved in the system(clients, cars, agents)
 */
public class RentalSystem {
  ArrayList <Client> clients;
  ArrayList <Car> cars;
  ArrayList <Agent> agents;

    /**
     * Constructor to create a RentalSystem object.
      * @param clients  Clients involved in the system
     * @param cars      Cars involved in the system
     * @param agents     Agents involved in the system
     */
  public RentalSystem(ArrayList<Client> clients, ArrayList<Car> cars, ArrayList<Agent> agents){
      this.clients = clients;
      this.cars = cars;
      this.agents = agents;
  }

  //Getters
    public ArrayList<Client>getClients(){
      return clients;
    }
    public ArrayList<Car>getCars(){
      return cars;
    }
    public ArrayList<Agent>getAgents(){
      return agents;
    }

    //Setters
    public void setClients(ArrayList<Client>clients){
      this.clients = clients;
    }
    public void setCars(ArrayList<Car>cars){
      this.cars = cars;
    }
    public void setAgents(ArrayList<Agent>agents){
        this.agents = agents;
    }
}
