/**
 * Class to represent a client's contact information
 * contains the client's home address, phone number and email address
 */
public class ContactDetails {
    String address;
    int phoneNo;
    String email;

    /**
     * Constructor to create a ContactDetails object
     * @param address  Home address of the client
     * @param phoneNo  Phone number of the client
     * @param email    Email address of the client
     */
    public ContactDetails(String address, int phoneNo, String email){
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    //Getters
    public String getAddress(){
        return address;
    }
    public int getPhoneNo(){
        return phoneNo;
    }
    public String getEmail(){
        return email;
    }

    //Setters
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNo(int phoneNo){
        this.phoneNo = phoneNo;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
