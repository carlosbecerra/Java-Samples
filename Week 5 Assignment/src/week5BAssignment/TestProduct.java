package week5BAssignment;

import java.util.Scanner;

public class TestProduct {
	public static void main(String[] args) {
		
		double listPrice = 0;
		Scanner scnr = new Scanner(System.in);
		//creation of objects
		Product prod1 = new Product();
		Product prod2 = new Product(2, "Milk", "Acme Inc", 3.45, "Food");
		
		System.out.println("Prod1 ProductID getter: " + prod1.getProductID());
		System.out.println("Prod1 ProductName getter: " + prod1.getProductName());
		System.out.println("Prod1 ProductManufacturer getter: " + prod1.getProductManufacturer());
		System.out.println("Prod1 ProductPrice getter: " + prod1.getProductPrice());
		System.out.println("Prod1 ProductCategory getter: " + prod1.getProductCategory());
		
		System.out.println("Prod2 ProductID getter: " + prod2.getProductID());
		System.out.println("Prod2 ProductName getter: " + prod2.getProductName());
		System.out.println("Prod2 ProductManufacturer getter: " + prod2.getProductManufacturer());
		System.out.println("Prod2 ProductPrice getter: " + prod2.getProductPrice());
		System.out.println("Prod2 ProductCategory getter: " + prod2.getProductCategory());
		
		System.out.println("Enter Product ID: ");
		prod1.setProductID(scnr.nextInt());
		System.out.println("Enter Product Name: ");
		scnr.nextLine();
		prod1.setProductName(scnr.nextLine());
		System.out.println("Enter Product Manufacturer: ");
		prod1.setProductManufacturer(scnr.nextLine());
		System.out.println("Enter Product Price: ");
		prod1.setProductPrice(scnr.nextDouble());
		System.out.println("Enter Product Category: ");
		prod1.setProductCategory(scnr.next());
		
		System.out.println("Prod1 ProductID getter: " + prod1.getProductID());
		System.out.println("Prod1 ProductName getter: " + prod1.getProductName());
		System.out.println("Prod1 ProductManufacturer getter: " + prod1.getProductManufacturer());
		System.out.println("Prod1 ProductPrice getter: " + prod1.getProductPrice());
		System.out.println("Prod1 ProductCategory getter: " + prod1.getProductCategory());
		
		listPrice = prod1.calculateListPrice(0.3);
		System.out.println("Prod1 calculated list price with 0.3 discount: " + listPrice);
		System.out.println("Prod1 calculated list price with 0.3 discount two decimal places: " + String.format("%.2f", listPrice));
		
		
		
	}
}
