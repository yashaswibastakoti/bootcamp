package JavaOOP;

public class Inclass{
    public static void main(String[] args){

        Product product = new Product("study table", 30.00, 10, true);
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Quantity: " + product.getQuantity());
        System.out.println("Product Availability: " + product.isAvailability());

        System.out.println();

        product.ShopPurchase(1);
        System.out.println("Updated Inventory: " + product.getQuantity());

        System.out.println();

        product.CustomerPurchase(2);
        System.out.println("Updated Inventory: " + product.getQuantity());

        System.out.println();

        product.ShopPurchase(5);
        System.out.println("Updated Inventory: " + product.getQuantity());
    }
}
class Product{
    //variables
    private String name;
    private double price;
    private int quantity;
    private boolean availability;

    //constructors
    public Product(String name, double price, int quantity, boolean availability){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.availability = availability;
    }
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void CustomerPurchase(int purchaseQuantity){
        if(purchaseQuantity > 0){
            quantity -= purchaseQuantity;
            System.out.println( "The new inventory after customer purchased is: " + quantity);
        }else{
            System.out.println("Can not be purchased.");
        }
    }
    public void ShopPurchase(int purchaseQuantity){
        if(purchaseQuantity > 0){
                quantity += purchaseQuantity;
            System.out.println("The new inventory after shop purchased is: " + quantity);
        } else{
            System.out.println("Can not be purchased.");
        }
    }
}
