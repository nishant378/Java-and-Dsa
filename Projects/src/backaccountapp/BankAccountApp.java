package backaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking ch=new Checking("john william","323456778",1500);
		
		Savings sav=new Savings("tom shiet","453678923",3000);
		
		sav.compound();
		
		
		ch.showInfo();
		System.out.println("********");
		sav.showInfo();
		
	     
		
	//Read a CSV file that create new accounts based on that data
        
		
		
		
	}

}
