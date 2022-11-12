package week89Assignment;

import java.util.Scanner;

public class SalariedEmployee extends Employee {

	private double annualSalary;
	private double stockOption;
	
	public SalariedEmployee() {
		super();
		this.annualSalary = 0.0;
		this.stockOption = 0.0;
	}
	
	public SalariedEmployee(String empName, int empNumber, String dateHired, double annualSalary, double stockOption) {
		super(empName, empNumber, dateHired);
		this.annualSalary = annualSalary;
		this.stockOption = stockOption;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getStockOption() {
		return stockOption;
	}

	public void setStockOption(double stockOption) {
		this.stockOption = stockOption;
	}
	
	public void calculatePension() {
		
		System.out.println("Enter the pension rate: ");
		Scanner input = new Scanner (System.in);
		double pensionRate = input.nextDouble();
		double calculatedPension = (annualSalary - stockOption) * pensionRate;
		
		System.out.println("The calculated pension is: "+ calculatedPension);
	}
	
}
