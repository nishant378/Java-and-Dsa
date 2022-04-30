
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=obj.nextInt();
		int count=1;
		int s=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			while(s<=count)
			{
				System.out.print(" ");
				s++;
			}
			count++;
			s=1;
		
		}
		
		

	}

}
