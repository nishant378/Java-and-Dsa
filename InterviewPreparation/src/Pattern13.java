
import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=obj.nextInt();
		
		int j;
		int temp=1;
		int c=n;
		for(int i=1;i<=n;i++)
		{
			//space
			while(temp<c)
			{
				System.out.print(" ");
				temp++;
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=(j-2);k>=1;k--)
			{
				System.out.print(k+" ");
			}
			temp=1;
			c--;
			System.out.println();
		}

	}

}
