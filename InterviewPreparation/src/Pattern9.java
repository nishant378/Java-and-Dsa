import java.util.*;
public class Pattern9 {

	public static void main(String[] args) {
	     Scanner obj=new Scanner(System.in);
	     System.out.println("Enter a number:");
	     int n=obj.nextInt();
	     
	     
	     int k=1;
	     int s=3;
	     for(int i=1;i<=n;i++)
	     {
	    	 for(int j=1;j<=i;j++)
	    	 {
	    		 if(i==1 || i==n || i==2)
	    		 {
	    		    System.out.print(j);
	    		    System.out.print(" ");
	    		 }
	    		 else
	    		 {
	    			 
	    			 if(j==1)
	    			 {
	    			 System.out.print(j);
	    			 }
	    			//space 
	    			 while(k<=s)
	    			 {
	    				 System.out.print(" ");
	    				 k++;
	    			 }
	    			
	    			 if(j==i)
	    			 {
	    				 System.out.print(j);
	    				 k=1;
	    				 s=s+2;
	    			 }
	    		 }
	    	 }
	    	 System.out.println();
	    	 
	     }
	     obj.close();

	}

}
