package threads;
import java.util.Scanner;
class Account  
{
   int bal;
	public Account(int bal)
	{
		this.bal=bal;
		
	}
    public boolean isSufficient(int a)
    {
    	if(bal>a)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    public void withdrawl(int am)
    {
    	bal=bal-am;
    	System.out.println("Money Left:"+bal);
    	System.out.println("Money withdrawl:"+am);
    }
}
class Customer implements Runnable
{
	private Account account ;//object type variable not a reference variable
	Customer(Account acc)
	{
		this.account=acc;
	}
	public void run()
	{
		synchronized(account)
		{
	     Scanner obj=new Scanner(System.in);
	     System.out.println("Enter your amount that you want to withdrawl:");
	     int amt=obj.nextInt();
	    if(account.isSufficient(amt))
	    {
	    	account.withdrawl(amt);
	    }
	    else
	    {
	    	System.out.println("Insufficient balance");
	    }
	   
	}
		
	}
}
public class MultipleThread {

	public static void main(String[] args) {
     Account obj=new Account(1000);
     Customer obj1=new Customer(obj);
     Customer obj2=new Customer(obj);
     Thread t1=new Thread(obj1);
     Thread t2=new Thread(obj2);
     t1.start();
     t2.start();
	}

}
