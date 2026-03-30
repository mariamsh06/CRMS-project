/**
 * Represents discount for a car in the CRMS
 * Contains discount type and discount amount
 */
public class Discount {
    String discountType;
    double discountAmount;

    /**
     * Constructor to create a Discount object
     * @param discountType    The type of discount to be applied
     *                        (e.g. loyalty, promotional, corporate)
     * @param discountAmount  Total discount applied
     */
    public Discount(String discountType, double discountAmount){
        this.discountType = discountType;
        this.discountAmount = discountAmount;
    }

    //Getters
    public String getDiscountType(){
        return discountType;
    }
    public double getDiscountAmount(){
        return discountAmount;
    }

    //Setters
    public void setDiscountType(String discountType){
        this.discountType = discountType;
    }
    public void setDiscountAmount(double discountAmount){
        this.discountAmount = discountAmount;
    }

}
