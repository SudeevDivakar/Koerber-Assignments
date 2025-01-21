package day2.question5;

/*
Now we need to implement the Payment system for that company. The company wants to handle
the employee payment and invoice in the same application. As Employee and Invoice are totally
unrelated objects, we cannot use the same class hierarchy; we have to use an interface called
“Payable” and implement that in both Employee class and Invoice class.
 */

public class Invoice implements Payable {
    private String partNum;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNum, String partDescription, int quantity, double pricePerItem) {
        this.partNum = partNum;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String newPartNum) {
        partNum = newPartNum;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String newPartDescription) {
        partDescription = newPartDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double newPricePerItem) {
        pricePerItem = newPricePerItem;
    }

    public String toString() {
        return "PartNum: " + partNum + ", PartDescription: " + partDescription + ", Quantity: " + quantity + ", Price per Item: " + pricePerItem;
    }

    public double getPayment() {
        return quantity * pricePerItem;
    }
}
