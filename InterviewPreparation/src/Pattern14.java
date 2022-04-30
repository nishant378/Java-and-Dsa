
import java.util.*;
public class Pattern14 {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter a number:");
	int n=obj.nextInt();
	
	int count=0;
	for(int a=1;a<=n;a++)
	{
		count=0;
	for(int i=1;i<=1000;i++)//values
	{
		for(int j=1;j<=i;j++)//divided by
		{
			if(i%j==0)
			{
				if(i==j)
				{
					System.out.print(i+" ");
					count++;
				}
				else if(i!=j)
				{
					if(j!=1)
					{
						break;
					}
				}
			}
		}
		if(count==a)
		{
			break;
		}
	}
	
	System.out.println();
	}

	}

}
