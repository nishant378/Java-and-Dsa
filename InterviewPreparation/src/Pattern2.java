
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		int count=1;
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==n)
				{
					System.out.print("*");
					System.out.print(" ");
				}
				else if(i!=1 && i!=n)
				{
					
					System.out.print("*");
					
					while(count<8)
					{
						System.out.print(" ");
						count++;
					}
					System.out.print("*");
					break;
					
			    }
						
				}
			count=1;
			System.out.println();
			
			}
			
		}



	}

