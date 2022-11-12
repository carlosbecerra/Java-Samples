package week89Assignment;

import java.util.Scanner;


public class TestEmployee {

	public static void main(String[] args) {
		
		System.out.println("Enter a selection");
		System.out.println("1 for hourly employee");
		System.out.println("2 for salaried employee");
		System.out.println("3 for consultant");
		
		Scanner input = new Scanner (System.in);
		int choice = input.nextInt();
		
		while(choice == 1 || choice == 2 || choice == 3) {
		switch(choice) {
		  case 1:
			  HourlyEmployee employee1 = new HourlyEmployee("Carlos", 1 , "10/05/2020", 15.0);
			  employee1.printLabel();
			  employee1.calculateWages();
		    break;
		  case 2:
			  SalariedEmployee employee2 = new SalariedEmployee("Joe", 2 , "11/22/2020", 50000, 5);
			  employee2.printLabel();
			  employee2.calculatePension();
		    break;
		  case 3:
			  Consultant employee3 = new Consultant("Michaell", 4 , "10/15/2021",10,45.0);
			  employee3.printLabel();
			  employee3.calculateFees();
			    break;
		  default:
		}
		System.out.println();
		System.out.println("Enter a selection");
		System.out.println("1 for hourly employee");
		System.out.println("2 for salaried employee");
		System.out.println("3 for consultant");
		choice = input.nextInt();
		}
	}

}
