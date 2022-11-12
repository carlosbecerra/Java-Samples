package week89AssignmentB;


public class TestPayable {

	public static void main(String[] args) {
		
		Payable payObj1 = new HourlyEmployee(131, 67.0 , "10/15/2019");
		Payable payObj2 = new SalariedEmployee(2, 70000 , "08/11/2022");
		Payable payObj3 = new Invoice(15,23,13.50,5);
		HourlyEmployee payObj4 = new HourlyEmployee(100,45,"11/05/2018");
		SalariedEmployee payObj5 = new SalariedEmployee(85,75000,"04/05/2019");
		Invoice payObj6 = new Invoice(13,103,5.50,2);
		payObj1.getPaymentAmount();
		payObj2.getPaymentAmount();
		payObj3.getPaymentAmount();
		System.out.println("");
		payObj4.getPaymentAmount();
		payObj5.getPaymentAmount();
		payObj6.getPaymentAmount();
	}
}
