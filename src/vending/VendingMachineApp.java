package vending;

import static org.junit.Assert.assertArrayEquals;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachineApp {


	public static void main(String[] args) {
		ArrayList<Inventory> list = new ArrayList<Inventory>();
		DecimalFormat df = new DecimalFormat("#0.00");
		String item;
		double cost;
		double payment = 0.0;
		double paymentsMade = 0.0;
		double refund = 0.0;

		list.add(new Inventory(1, "Cola", 1.00));
		list.add(new Inventory(2, "Doritos", .50));
		list.add(new Inventory(3, "Reeces", .65));

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Vending Machine");
		createInventoryList(list);
		System.out.println("Please select your item");
		int selection = scan.nextInt();
		scan.nextLine();
		item = list.get(selection - 1).getItemName();
		cost = list.get(selection - 1).getCost();
		double initalCost =list.get(selection - 1).getCost();
		System.out.println("You have selected " + item);

		while (cost >= 0) {
			System.out.println( message(payment)+ df.format(cost));
			payment = scan.nextDouble();
			scan.nextLine();
			if(acceptableCoins(payment)==true){
			paymentsMade =paymentsMade+payment;
			cost = cost-payment;
			if(paymentsMade>cost){
				refund= paymentsMade - initalCost;
			}
			}else
				System.out.println("Invalid Coin");
		}
		System.out.println("Your item has been dispensed\nThank you");
		if (refund>0)
			System.out.println("your change is "+ df.format(refund));
		
	}

	public static void createInventoryList(ArrayList<Inventory> list) {
		DecimalFormat df = new DecimalFormat("#0.00");
		for (Inventory items : list) {
			System.out.print("Item number:" + items.getIdNumber() + " ");
			System.out.print(items.getItemName() + " ");
			System.out.print("$" + df.format(items.getCost()));

			System.out.println();
		}
	}
	

	public static Boolean acceptableCoins(double pmt) {
		if (pmt == .25 || pmt == .05 || pmt == .10) {
			return true;
		}
		return false;
	}



	// display message
	public static String message(double paid) {
		if(paid == 0 )
			return "Insert Coins ";
		else 
			return "Please insert ";
	}

}
