package backaccountapp;

public abstract class Account implements IBaseRate {
	
	//list common properties for saving and checking accounts
	String name;
	String sSN;//social security number
	double balance;
	
	private static int index=10000;
	protected String accountNumber;
	protected double rate;
	
	//constructor to set base properties and initialize the account
	public Account(String name,String sSN,double initDeposit)
	{
		this.name=name;
		this.sSN=sSN;
		this.balance=initDeposit;
		
		
		//set account number
		index++;
		this.accountNumber=setAccountNumber();
	
		setRate();
		
	}
	
	public abstract void setRate();
	
	private String setAccountNumber()
	{
		String lastTwoOfsSN=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID=index;
		int random=(int)(Math.random()*Math.pow(10,3));
		return lastTwoOfsSN+uniqueID+random;
	}
	
	public void compound()
	{
		double accuredInterest=balance * (rate/100);
		balance=balance+accuredInterest;
		
	}
	
	
	
	
	
	
	//list common methods-transaction	
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	public void withdrawl(double amount)
	{
		balance=balance-amount;
		System.out.println("Withdrawing $"+amount);
		printBalance();
	}
	public void transfer(String toWhere,double amount)
	{
		balance=balance-amount;
		System.out.println("Transfering $" +amount +" " +"to"+" "+toWhere);
		printBalance();
	}
	public void printBalance()
	{
		System.out.println("Your balance is:"+balance);
	}
	
	
	void showInfo()
	{
		System.out.println(
				"NAME:"+name +
				"\nAccount number:"+accountNumber +
				"\nBalance:"+balance +
				"\nRate:" + rate +"%"
				);
	}
	
	

}
