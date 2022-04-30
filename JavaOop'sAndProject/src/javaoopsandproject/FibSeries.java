package javaoopsandproject;
import java.util.Scanner;
public class FibSeries {

	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int a=0;
	    int b=1;
	    int c;
	    int n;
	    try
	    {
	    System.out.println("Enter the value of n:");
	     n=obj.nextInt();
	  
	    System.out.println(a);
    	System.out.println(b);
	    for(int i=1;i<=n;i++)
	    {
	    	c=a+b;
	    	if(c<=n)
	    	{
	    	System.out.println(c);
	    	}
	    	a=b;
	    	b=c;
	    	if(c>n)
	    	{
	    		break;
	    	}
	    }
	    obj.close();
	    
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Print enter valid number");
	    }

	}

}
