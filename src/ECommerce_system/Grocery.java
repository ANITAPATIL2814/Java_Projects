package ECommerce_system;
//Grocery class extends Product

public class Grocery extends Product {
	private String expiryDate;

	// Constructor
    public Grocery(int productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
