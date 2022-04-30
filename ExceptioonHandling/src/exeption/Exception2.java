package exeption;
//default throw our catch,runtime exception
public class Exception2 {

	public static void main(String[] args) {
	
		try
		{
			
			System.out.println(3/0);
			System.out.println("he");
		}
		
         catch(ArithmeticException e)
         {
        	 System.out.println("Exception:"+e.getMessage());
         }
		
	}

}
