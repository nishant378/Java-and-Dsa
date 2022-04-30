
import java.util.*;

public class Pattern6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=obj.nextInt();
		int z=n;
		int temp=1;
		
		
		int s=1;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1 || i==n)
				{
				//space
				while(temp<z)
				{
					System.out.print(" ");
					temp++;
				}
				System.out.print("* ");
				}
				else
				{
					//space
					while(temp<z)
					{
						System.out.print(" ");
						temp++;
					}
				    System.out.print("*");
				    //space
				    while(k<=s)
				    {
				    	System.out.print(" ");
				    	k++;
				    }
				    System.out.print("*");
					 if(i!=1 || i!=n)
						{
						  k=1;
						  s=s+2;
						}
				    break;
				   
				}
			}
			System.out.println();
		
			temp=1;
			z--;
		}
		
		
		

	}
	
	

}
