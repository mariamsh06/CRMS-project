/**
 * Class to represent a car in the Car Rental Management System
 * Contains the car's features and insuranceDetails
 */
public class Car {
    String carID;
    double baseRate;
    Features features; //The car's feature
    InsuranceDetails insuranceDetails; //The car's insurance information

    /**
     * constructor to create a car object.
     * @param features           features of the car
     * @param insuranceDetails   insurance information about the car
     */
    public Car(Features features, InsuranceDetails insuranceDetails, String carID, double baseRate){
        this.features = features;
        this.insuranceDetails = insuranceDetails;
        this.carID= carID;
        this.baseRate= baseRate;
    }

    //Getters
    public Features getFeatures(){
        return features;
    }
    public InsuranceDetails getInsuranceDetails(){
        return insuranceDetails;
    }
    public String getCarID(){ return carID;}
    public double getBaseRate() {return baseRate;}

    //Setters
    public void setFeatures(Features features){
        this.features = features;
    }
    public void setInsuranceDetails(InsuranceDetails insuranceDetails){
        this.insuranceDetails = insuranceDetails;
    }
    public void setBaseRate(double baseRate) {this.baseRate = baseRate;}
    public void setCarID(String carID) {this.carID = carID;}
}
