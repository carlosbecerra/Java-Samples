package week5BAssignment;

public class Product {
	//instance variables
	private int productID;
	private String productName;
	private String productManufacturer;
	private double productPrice;
	private String productCategory;
	
	//method for calculating the list price
	public double calculateListPrice(double discount) {
		double listPrice = getProductPrice() * (1-discount);
		return listPrice;
	}
	
	//getters and setters
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

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}
	
	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	//constructors
	public Product() {
		this.productID = 1;
		this.productName = "Computer";
		this.productManufacturer = "Apple";
		this.productPrice = 850;
		this.productCategory = "Electronics";
	}
	
	public Product(int productID, String productName, String productManufacturer, double productPrice, String productCategory) {
		this.productID = productID;
		this.productName = productName;
		this.productManufacturer = productManufacturer;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}
	

}
