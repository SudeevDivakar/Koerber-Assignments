package Day5.Question4;

/*
Create a program to create PriorityQueque to store product information
Product class : consist of fields: productId, productName, productPrice. Create and store 5 product into
PriorityQueque
You need to use Comparator for custom priority (as per productPrice)
 */

public class Product implements Comparable<Product> {
    private int productID;
    private String productName;
    private double productPrice;

    public Product(int productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(productID)
                .append(" - ")
                .append(productName)
                .append(" - ")
                .append(productPrice).toString();

    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.getProductPrice(), o.getProductPrice());
    }
}
