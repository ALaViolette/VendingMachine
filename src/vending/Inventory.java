package vending;

import java.text.DecimalFormat;

public class Inventory {
	
	private int idNumber;	
	 private String itemName;
	 private double cost;
	
	
	
	public Inventory(int idNumber, String itemName, double cost) {
		setIdNumber(idNumber);
		setItemName(itemName);
		setCost(cost);
		
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
	DecimalFormat df = new DecimalFormat("#0.00");
//		df.format(cost);
		this.cost = cost;
	}

 
}
