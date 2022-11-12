
package week89Assignment;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	private double hourlyRate;
	
	public HourlyEmployee() {
		super();
		this.hourlyRate = 0.0;
	}
	
	public HourlyEmployee(String empName, int empNumber, String dateHired, double hourlyRate) {
		super(empName, empNumber, dateHired);
		this.hourlyRate = hourlyRate;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public void calculateWages() {
		
		System.out.println("Enter the number of hours worked: ");
		Scanner input = new Scanner (System.in);
		double hours = input.nextDouble();
		double wages = hours*this.hourlyRate;
		
		System.out.println("Wages are: "+ wages);
	}
	
}
