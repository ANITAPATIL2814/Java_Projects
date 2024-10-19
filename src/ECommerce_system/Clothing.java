package ECommerce_system;
//Clothing class extends Product
public class Clothing extends Product{
	 private String size;
	 private String fabricType;
	 	// Constructor
	    public Clothing(int productId, String name, double price, String size, String fabricType) {
	        super(productId, name, price);
	        this.size = size;
	        this.fabricType = fabricType;
	    }

	    public String getSize() {
	        return size;
	    }

	    public String getFabricType() {
	        return fabricType;
	    }
}
