package javaoopsandproject;
//our throw and default catch 
public class ThrowAndCatch3 {

	public static void main(String[] args) {
		int balance=5000;
		int withdrawl=6000;
		if(balance<withdrawl)
		{
			throw new ArithmeticException("Insufficient balance");
		}
		balance=balance-withdrawl;
		System.out.println("transaction successfully completely");
		System.out.println("program continue....");

	}

}
