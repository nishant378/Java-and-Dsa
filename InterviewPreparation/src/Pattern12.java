 
import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=obj.nextInt();
	
		char p='A';
	
		char a;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+" ");
				p++;
			}
	        a=(char) (p-2);
	       
	        for(;a!='@';a--)
	        {
	        	System.out.print(a+" ");
	        }
			p='A';
			System.out.println();
			
		}
		
		
		

	}

}
