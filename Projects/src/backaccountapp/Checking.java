package backaccountapp;

public class Checking  extends Account{
	
	//list properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	//constructor to initialize checking account properties
	public Checking (String name,String sSN,double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber="2"+accountNumber;
		
		setDebitCard();
	}
	
	private void setDebitCard()
	{
		debitCardNumber=(int)(Math.random() * Math.pow(10,12));
		debitCardPIN=(int)(Math.random() * Math.pow(10,4));
		
	}
	
	@Override
	public void setRate()
	{
		rate=getBaseRate() * .15;
	}
	//list any methods specific to the checking account
	public void  showInfo()
	{
		super.showInfo();
	System.out.println("your checking account feature" +
			"\nyour debit card number:"+debitCardNumber +
			"\nyour debit card pin code:"+ debitCardPIN
			);
	}

}
