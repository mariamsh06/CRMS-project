/**
 * Class to represent a client's license information in the CRMS
 * contains name, any restrictions and validity period
 */
public class LicenseDetails {
    String name;
    String restriction;
    String IdNo;
    String validDate;

    /**
     * Constructor to create licenseDetails object
      * @param name  The name of the client
     * @param restriction  any license restriction
     * @param IdNo  The client's ID number
     * @param validDate  license validity period
     */
    public LicenseDetails(String name, String restriction, String IdNo, String  validDate){
        this.name = name; //client's name
        this.restriction = restriction; //any restiction on the license
        this.IdNo = IdNo; //ID number
        this.validDate =  validDate; //validity period
    }

    //Getters
    public String getName(){
        return name;
    }
    public String getRestriction(){
        return restriction;
    }
    public String getIdNo(){
        return IdNo;
    }
    public String getValidDate(){
        return validDate;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setRestriction(String restriction){
        this.restriction = restriction;
    }
    public void setIdNo(String IdNo){this.IdNo = IdNo;}
    public void setValidDate(String validDate){
        this.validDate = validDate;
    }
}
