package javaoopsandproject;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
	
		Scanner obj=new Scanner(System.in);
		try
		{
		System.out.println("Enter the value of n");
		int n=obj.nextInt();
		int f=1;
		for(int i=n;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println(f);
         obj.close();
		}
		catch(Exception e)
		{
			System.out.println("Please enter valid number");
		}
	}

}
