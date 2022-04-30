package javaoopsandproject;

import java.util.Scanner;

class Account
{
	private int bal;
	public Account(int bal)
	{
	    this.bal=bal;
	}
	public boolean isSufficientbalance(int w)
	{
		if(bal>w)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void withdraw(int amt)
	{
		bal=bal-amt;
		System.out.println("Withdrawl money is:"+amt);
		System.out.println("Your current balance is:"+bal);
	}
}
class Customer implements Runnable 
{
	private String n;
	private Account account;
	public Customer (Account account,String name)
	{
		this.account=account;
		n=name;
	}
	public void run()
	{
		@SuppressWarnings("resource")
		Scanner kb=new Scanner(System.in);
		synchronized(account)
		{
		System.out.println("Enter amt to withdraw:");
		int amt=kb.nextInt();
		
		if(account.isSufficientbalance(amt))
		{
			System.out.println(n);
			account.withdraw(amt);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		}
	}
}
public class MultipleThreading {

	public static void main(String[] args) {
		Account obj=new Account(1000);
		Customer c1=new Customer(obj,"Raj");
		Customer c2=new Customer(obj,"Eyia");
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();

	}

}
