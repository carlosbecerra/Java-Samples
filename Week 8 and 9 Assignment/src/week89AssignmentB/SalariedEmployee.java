package week89AssignmentB;

public class SalariedEmployee implements Payable {

	private int empNumber;
	private double annualSalary;
	private String hireDate;
	
	public void getPaymentAmount() {
		System.out.println("Annual salary for the employee is: " + annualSalary);
	}
	
	public SalariedEmployee(int empNumber, double annualSalary, String hireDate) {
		this.empNumber = empNumber;
		this.annualSalary = annualSalary;
		this.hireDate = hireDate;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public String getHireDate() {
		return hireDate;
	}
}

