
import java.util.*;
public class Pattern8 {

	public static void main(String[] args) {
	   Scanner obj=new Scanner(System.in);
	   System.out.print("Enter a number:");
       int n=obj.nextInt();
       
       for(int i=n;i>=1;i--)
       {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print(j);
    		   System.out.print(" ");
    	   }
    	   System.out.println();
       }
       obj.close();
	}

}
