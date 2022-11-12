package week89Assignment;

public class Employee {
	
	private String empName;
	private int  empNumber;
	private String dateHired;
	

	public Employee() {
		this.empName = "";
		this.empNumber = 1;
		this.dateHired = "";
	}
	
	public Employee(String empName, int empNumber, String dateHired) {
		this.empName = empName;
		this.empNumber = empNumber;
		this.dateHired = dateHired;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	
	public int printLabel() {
		
		return 5;
	}
	
	
}
