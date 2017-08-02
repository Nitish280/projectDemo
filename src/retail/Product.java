package retail;

/*
 * here we are creating product class
 */
public class Product {
	// here we are declaring some product class properties
	public int productId;
	String productName;
	double productPrice;
	String productStatus = "Available";

	/**
	 * here we are creating constructor for the product class
	 * 
	 * @param productId
	 * @param productName
	 * @param productPrice
	 */
	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	/**
	 * here we are using getter n setter with all three properties of product
	 * class we are using the getter n setter because it help us to view the
	 * value of the variables,and we can also modify the value with the help of
	 * this getter n setter
	 * 
	 * @return
	 */

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public String getProductStatus() {
		return productStatus;

	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

}
