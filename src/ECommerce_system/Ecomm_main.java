package ECommerce_system;

public class Ecomm_main {
    public static void main(String[] args) {
    	
        // Creating instances of different product types
        Electronics e = new Electronics(1, "Mobile", 5000.00, 24);
        Clothing c = new Clothing(2, "T-Shirt", 2000.00, "M", "Cotton");
        Grocery g = new Grocery(3, "milk", 100.50, "2024-12-31");

        // Displaying product details
        System.out.println(e.getName() + " : " + e.getPrice() + " - Warranty: " + e.getWarrantyPeriod() + " months");
        System.out.println(c.getName() + " : " + c.getPrice() + " - Size: " + c.getSize() + " - Fabric: " + c.getFabricType());
        System.out.println(g.getName() + " : " + g.getPrice() + " - Expiry: " + g.getExpiryDate());
    }
}
