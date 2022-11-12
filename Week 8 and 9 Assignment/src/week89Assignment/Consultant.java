package week89Assignment;

import java.util.Scanner;

public class Consultant extends Employee{

	private int contractNumber;
	private double billingRate;
	
	public Consultant() {
		
	}
	
	public Consultant(String empName, int empNumber, String dateHired, int contractNumber, double billingRate) {
		super(empName, empNumber, dateHired);
		this.contractNumber = contractNumber;
		this.billingRate = billingRate;
	}

	public int getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(int contractNumber) {
		this.contractNumber = contractNumber;
	}

	public double getBillingRate() {
		return billingRate;
	}

	public void setBillingRate(double billingRate) {
		this.billingRate = billingRate;
	}
	
	public int printLabel() {
		return 61;
	}
	public void calculateFees() {
		
		
		
		
		System.out.println(this.billingRate);
	}
}
