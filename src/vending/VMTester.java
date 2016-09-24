package vending;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VMTester {
	
	

@Test
public void insertQuarter(){
	assertEquals(true,VendingMachineApp.acceptableCoins(.25));
}

@Test
public void insertPennie(){
	assertEquals(false,VendingMachineApp.acceptableCoins(.01));
}

@Test
public void insertInvalidMoney(){
	assertEquals(false,VendingMachineApp.acceptableCoins(.20));
}



@Test
public void noMoneyInserted(){
	assertEquals("Insert Coins ",VendingMachineApp.message(0));
}

@Test
public void twentyFiveCentsInsertedDisplayTest(){
	assertEquals("Please insert ",VendingMachineApp.message(.25));
}



}