package week89AssignmentB;

import java.util.Scanner;

public class HourlyEmployee implements Payable {

	private int empNumber;
	private double hourlyRate;
	private String contractDate;
	
	public void getPaymentAmount() {
		calculateWages();
	}
	
	public HourlyEmployee(int empNumber, double hourlyRate, String contractDate) {
		this.empNumber = empNumber;
		this.hourlyRate = hourlyRate;
		this.contractDate = contractDate;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public String getContractDate() {
		return contractDate;
	}
	
	public void calculateWages() {
		System.out.println("Enter the number of hours worked: ");
		Scanner input = new Scanner (System.in);
		double hours = input.nextDouble();
		double wages = hours*this.hourlyRate;
		System.out.println("Wages are: "+ wages);
	}
	
}

