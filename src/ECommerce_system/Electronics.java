package ECommerce_system;
//Electronics class extends Product
public class Electronics extends Product {
	private int warrantyPeriod;

	// Constructor
    public Electronics(int productId, String name, double price, int warrantyPeriod) {
    	super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    
}
