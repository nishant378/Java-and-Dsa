package backaccountapp;

public class Savings extends Account {

	
	//list properties specific to the saving accounts
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//constructor to initialize settings for the saving account properties 
	public Savings(String name,String sSN,double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
	}
	
	
	public void setRate()
	{
		rate=getBaseRate() -0.25;
	}
	
	private void setSafetyDepositBox()
	{
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10,3));
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10,4));
	}
	
	
	//list any methods specific to the saving accounts
	
	public void  showInfo()
	{
		super.showInfo();
		System.out.println(
				"Your Saving account features" +
		         "\nSafety Deposit Box ID:" + safetyDepositBoxID +
		         "\nSafety Deposit Box Key:" + safetyDepositBoxKey
				);
	}
}
