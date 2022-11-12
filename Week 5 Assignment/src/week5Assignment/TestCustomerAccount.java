package week5Assignment;

import java.util.Scanner;

public class TestCustomerAccount {
	public static void main(String[] args) {
		
		double paymentAmt;
		double purchaseAmt;
		
		CustomerAccount custAcct1 = new CustomerAccount();
		System.out.println("Return value of payment getter in custAcct1: " + custAcct1.getPayment());
		System.out.println("Return value of purchase getter in custAcct1: " + custAcct1.getPurchase());
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter payment amount");
		paymentAmt = scnr.nextDouble();
		System.out.println("Enter purchase amount");
		purchaseAmt = scnr.nextDouble();
		CustomerAccount custAcct2 = new CustomerAccount(purchaseAmt,paymentAmt);
		System.out.println("Return value of payment getter in custAcct2: " + custAcct2.getPayment());
		System.out.println("Return value of purchase getter in custAcct2: " + custAcct2.getPurchase());
		
		System.out.println("Enter payment amount");
		paymentAmt = scnr.nextDouble();
		System.out.println("Enter purchase amount");
		purchaseAmt = scnr.nextDouble();
		custAcct1.setPayment(paymentAmt);
		custAcct1.setPurchase(purchaseAmt);
		System.out.println("Return value of payment getter in custAcct1: " + custAcct1.getPayment());
		System.out.println("Return value of purchase getter in custAcct1: " + custAcct1.getPurchase());
		custAcct1.recordPayment(50);
		System.out.println("Return value of payment getter in custAcct1: " + custAcct1.getPayment());
		custAcct1.recordPurchase(20);
		System.out.println("Return value of purchase getter in custAcct1: " + custAcct1.getPurchase());
		custAcct1.printBalance();
	}

}
