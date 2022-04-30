package javaoopsandproject;

public class ThrowAndCatch4 {

	public static void main(String[] args) {
		int balance=5000;
		int withdrawl=6000;
		try
		{
			if(balance<withdrawl)
			{
				throw new ArithmeticException("Insufficient balance");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception:"+e.getMessage());
		}
		System.out.println("Program continue...");

	}

}
