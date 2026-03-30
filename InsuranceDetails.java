/**
 * Represent the insurance details of a car in the CRMS.
 * Contains the insurance provider, coverage options and optional
 * add-ons.
 */
public class InsuranceDetails {
    String insuranceProvider;
    String coverage;
    String addOns;

    /**
     * Constructor to create an InsuranceDetails object
     * @param insuranceProvider   The name of the insurance provider
     * @param coverage            The coverage options available
     * @param addOns              The add-ons available(e.g. premium cover, accident protection)
     */
    public InsuranceDetails (String insuranceProvider, String coverage,String addOns) {
        this.insuranceProvider = insuranceProvider;
        this.coverage = coverage;
        this.addOns = addOns;
    }
    //Getters
    public String getInsuranceProvider(){return insuranceProvider;}
    public String getCoverage(){return coverage;}
    public String getAddOns(){return addOns;}

    //Setters
    public void setInsuranceProvider(String insuranceProvider){
        this.insuranceProvider = insuranceProvider;
    }
    public void setCoverage(String coverage){
        this.coverage = coverage;
    }
    public void setAddOns(String addOns) { this.addOns = addOns; }}




