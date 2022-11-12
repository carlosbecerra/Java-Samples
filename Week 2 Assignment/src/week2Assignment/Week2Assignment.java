package week2Assignment;

import java.util.Scanner;

public class Week2Assignment {
	public static void main(String[] args) {
		int userSelection = 0;
		int numAdult = 0;
		int numChildren = 0;
		double totalPriceTicket = 0;
		int numNights = 0;
		int type1Rooms = 0;
		int type2Rooms = 0;
		double totalPriceHotel = 0;
		double finalTotalPrice = 0;
		double totalPrice = 0;
		
		System.out.println("Please select an option.");
		System.out.println("1. Ticket");
		System.out.println("2. Hotel");
		System.out.println("3. Quit");
		
		Scanner scnr = new Scanner(System.in);
		userSelection = scnr.nextInt();
		while (userSelection != 3)
		{
			
			
			if ( userSelection == 1) {
				System.out.println("How many tickets for adults?");
				numAdult = scnr.nextInt();
				System.out.println("How many tickets for children under 11?");
				numChildren = scnr.nextInt();
				totalPriceTicket = totalPriceTicket + getTicketPrice(numAdult, numChildren);
				System.out.println("The Running subtotal for tickets is: " + totalPriceTicket);
			}
			else if (userSelection == 2) {
				System.out.println("Provide the number of nights to book the hotel rooms.");
				numNights = scnr.nextInt();
				System.out.println("How many type 1 rooms?");
				type1Rooms = scnr.nextInt();
				System.out.println("How many type 2 rooms?");
				type2Rooms = scnr.nextInt();
				totalPriceHotel =  totalPriceHotel + getHotelPrice(numNights, type1Rooms, type2Rooms);
				System.out.println("The running subtotal for hotel nights is: " + totalPriceHotel);
			}
			System.out.println("Please select an option.");
			System.out.println("1. Ticket");
			System.out.println("2. Hotel");
			System.out.println("3. Quit");
			
			
			userSelection = scnr.nextInt();
		}
		
		totalPrice = totalPriceHotel + totalPriceTicket;
		finalTotalPrice = totalPrice + (totalPrice * .05);
		System.out.println("The total Price is: " + totalPrice);
		System.out.println("The final total Price is: " + finalTotalPrice);
		
		
	}
	public static double getTicketPrice(double numAdult, double numChildren) {
		double priceAdult = 150.0;
		double priceChildren = 80.0;
		double totalPriceTicket = (numAdult*priceAdult) + (numChildren*priceChildren);
		System.out.println("The number of tickets for children is: " + numChildren);
		System.out.println("The calculated price for the children's tickets is: "+ (numChildren *priceChildren));
		System.out.println("The number of tickets for adults is: " + numAdult);
		System.out.println("The calculated price for the adults's tickets is: "+ (numAdult*priceAdult));
		return totalPriceTicket;
	}
	
	
	public static double getHotelPrice(double numNights, double type1Room, double type2Room) {
		double type1RoomCost = 100.0;
		double type2RoomCost = 80.0;
		double totalPriceHotel = numNights*((type1Room*type1RoomCost) + (type2RoomCost*type2Room));
		System.out.println("The number of nights is: " + numNights);
		System.out.println("The number of type 1 rooms is: "+ type1Room);
		System.out.println("The price of type 1 rooms is: "+ type1Room*type1RoomCost);
		System.out.println("The number of type 2 rooms is: "+ type2Room*type2RoomCost);
		return totalPriceHotel;
	}

}
