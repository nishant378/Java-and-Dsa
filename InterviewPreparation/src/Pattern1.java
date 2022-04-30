
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		 
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number:");
		
		 int n=obj.nextInt();
	   
	    
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<5;j++)
	    	{
	    		System.out.print("*");
	    		System.out.print(" ");
	    	}
	    	System.out.println();
	    }
	    obj.close();

	}

}
