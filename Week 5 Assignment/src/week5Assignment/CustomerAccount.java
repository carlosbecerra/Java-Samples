package week5Assignment;

public class CustomerAccount {
	private double payment;
	private double purchase;
	
	public void recordPayment(double amount) {
		payment += amount;
	}
	public void recordPurchase(double amount) {
		purchase += amount;
	}
	public void printBalance() {
		System.out.println("Balance is: "+ (purchase-payment));
		System.out.println("Payment balance is: " + payment);
		System.out.println("Purchase balance is: " + purchase);
	}
	public double getPayment() {
		return this.payment;
	}
	public double getPurchase() {
		return this.purchase;
	}
	public void setPurchase(double amount) {
		this.purchase = amount;
	}
	public void setPayment(double amount) {
		this.payment = amount;
	}
	public CustomerAccount() {
		this.payment = 50;
		this.purchase = 100;
	}
	public CustomerAccount(double purchaseAmt, double paymentAmt) {
		this.payment = paymentAmt;
		this.purchase = purchaseAmt;
	}
	
}
