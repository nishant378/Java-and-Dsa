package javaoopsandproject;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		   Scanner obj=new Scanner(System.in);
	      
		   try
		   {
	       System.out.println("Enter the value of n:");
	       int n=obj.nextInt();
	     
		   @SuppressWarnings("deprecation")
		   Integer i=new Integer(n);
	       String s=i.toString();
	       char ch[]=new char[s.length()];
	       int a[]=new int[s.length()];
	       for (int r = 0; r < s.length(); r++) { 
	            ch[r] = s.charAt(r); 
	        }
	        for(int p=0;p<a.length;p++)
	        {
	        	a[p]=(int)ch[p]-48;
	        }
	        int sum=0;
	        for(int q=0;q<a.length;q++)
	        {
	        	sum=sum+(a[q]*a[q]*a[q]);
	        }
	        
	        if(sum==n)
	        {
	        	System.out.println("it's an Armstrong number");
	        }
	        else
	        {
	        	System.out.println("it's not an armstrong number");
	        }
	        
	       obj.close();
		   }
		   catch(Exception e) {
			   System.out.println("Please enter valid input");
		   }
	       
	      

	}

}
