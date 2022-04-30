package javaoopsandproject;
//default throw and our catch 
public class ThrowAndCatch2 {

	public static void main(String[] args) {
		try
		{
			System.out.println(3/0);
			System.out.println("after exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Hi Barcelono...!");

	}

}
