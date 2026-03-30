/**
 * Represents the payment details to go through in order to rent a car in the CRMS
 * Contains deposit amount, total rental cost and outstanding balance(if any).
 */
public class PaymentDetails {
    double deposit;
    double rentalCost;
    double outstandingBalance;

    /**
     * Constructor to create a PaymentDetails object
     * @param deposit           The initial amount to rent a car
     * @param rentalCost         The total cost of rental
     * @param outstandingBalance  The amount left unpaid
     */

    public PaymentDetails(double deposit, double rentalCost, double outstandingBalance){
        this.deposit = deposit;
        this.rentalCost = rentalCost;
        this.outstandingBalance = outstandingBalance;
    }

    //Getters
    public double getDeposit() {
        return deposit;
    }
    public double getRentalCost() {
        return rentalCost;
    }
    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    //Setters
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }
    public void setOutstandingBalance(double outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }
}
