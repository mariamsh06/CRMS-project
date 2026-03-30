/**
 * Class to represent features of a car
 * Contains information about car's fuel type, category, transmission and seating capacity
 */
public class Features {
    String fuelType; //car's fuel type
    String category; //car category
    String transmission; // car's transmission type
    int seating; //car's seating capacity

    /**
     * Constructor to create a Features object
     * @param fuelType      The car's fuel type
     * @param category      The car's category
     * @param transmission  The car's transmission type
     * @param seating       The car's seating capacity
     */
    public Features (String fuelType, String category, String transmission, int seating){
        this.fuelType = fuelType;
        this.category = category;
        this.transmission = transmission;
        this.seating = seating;
    }

    //Getters
    public String getFuelType(){
        return fuelType;
    }
    public String getCategory(){
        return category;
    }
    public String getTransmission(){
        return transmission;
    }
    public int getSeating(){
        return seating;
    }

    //Setters
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setTransmission(String transmission){
        this.transmission = transmission;
    }
    public void setSeating(int seating){
        this.seating = seating;
    }


}
