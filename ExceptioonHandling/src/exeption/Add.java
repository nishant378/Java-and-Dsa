package exeption;
import java.util.*;
public class Add {

	public static void main(String[] args) {
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two number:");
		try
		{
		a=obj.nextInt();
		 b=obj.nextInt();
		 c=a+b;
		 System.out.println(c);
		
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception:"+e.getMessage());
		}
		
		System.out.println("Program End!");
	}
	 
}
