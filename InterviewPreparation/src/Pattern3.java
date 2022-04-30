
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
	    int c=n;
	    int temp=1;
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		if(i==1)
	    		{
	    		System.out.print("*");
	    		}
	    		else if(i==n)
	    		{
	    			System.out.print("*");
	    			break;
	    		}
	    		else 
	    		{
	    			System.out.print("*");
	    			while(temp<=((c-1)-1))
	    			{
	    				System.out.print(" ");
	    				temp++;
	    			}
	    			System.out.print("*");
	    			break;
	    			
	    		}
	    	}
	    	temp=1;
	    	c--;
	    	System.out.println();
	    	System.out.println();
	    }
	    obj.close();

	}

}
