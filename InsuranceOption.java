/**
 * Represents insurance options for a car in the CRMS
 * Contains insurance type and insurance amount
 */
public class InsuranceOption {
    String insuranceType;
    double insuranceAmount;

    /**
     * Constructor to create an InsuranceOption object
     * @param insuranceType    The type of insurance(e.g. standard or premium)
     * @param insuranceAmount  The cost of the insurance plan
     */
    public InsuranceOption(String insuranceType, double insuranceAmount){
        this.insuranceType= insuranceType;
        this.insuranceAmount = insuranceAmount;
    }
    //Getters
    public String getInsuranceType(){
        return insuranceType;
    }
    public double getInsuranceAmount(){
        return insuranceAmount;
    }

    //Setters
    public void setInsuranceType(String insuranceType){
        this.insuranceType = insuranceType;
    }
    public void setInsuranceAmount(double insuranceAmount){
        this.insuranceAmount = insuranceAmount;
    }

}
