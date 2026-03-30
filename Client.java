/**
 * Represents a client in the CRMS
 * Contains client name, license details and contact details
 */

public class Client {
    String name;
    LicenseDetails licenseDetails;
    ContactDetails contactDetails;

    /**
     * Constructor to create client object
     * @param name   The full name of client
     * @param licenseDetails  The client's license information
     * @param contactDetails  the client's contact details
     */


    public Client(String name, LicenseDetails licenseDetails, ContactDetails contactDetails){
        this.name = name;
        this.licenseDetails = licenseDetails;
        this.contactDetails = contactDetails;
    }

    //Getters
    public String getName(){
        return name;
    }
    public LicenseDetails getLicenseDetails(){
        return licenseDetails;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setLicenseDetails(LicenseDetails licenseDetails){
        this.licenseDetails = licenseDetails;
    }
    public void setContactDetails(ContactDetails contactDetails){
        this.contactDetails = contactDetails;
    }
}
