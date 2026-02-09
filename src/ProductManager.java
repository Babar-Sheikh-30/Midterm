public class ProductManager {
    private String productName;
    private double price;
    
    public ProductManager(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    
    public void displayProduct() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }
    
    // Calculates the discount amount based on the given discount percentage
    public double calculateDiscount(double discountPercent) {
        return price * (discountPercent / 100);
    }
   
}