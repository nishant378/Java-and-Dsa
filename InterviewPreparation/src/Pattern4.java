
import java.util.*;
public class Pattern4 {
	
	public static void main(String []args)
	{
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=obj.nextInt();
		int c=n;
		int temp=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			     while(temp<c) 
			     {
				   System.out.print(" ");
				   temp++;
			     }
			     System.out.print("*");
			     System.out.print(" ");
			}
			System.out.println();
			c--;
			temp=1;
			
		}
	
		
		
		
		
	}

}
