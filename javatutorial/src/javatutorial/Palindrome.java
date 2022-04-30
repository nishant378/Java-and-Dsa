package javatutorial;

import java.util.Scanner;

class P
{	
    void isPal(String a)
    {
    	String str[]=a.split("");
       int b= str.length;
       String c[]=new String[b];
       int j=b-1;
    for(int i=0;i<=b-1;i++)
    {
        c[j]=str[i];
        j=j-1;
    }
    for(int r=0;r<=b-1;r++)
    {
    	System.out.printf(c[r]);
    }
   for(int k=0;k<=b-1;k++)
   {
	  if(c[k].equals(str[k]))
	  {		 		  
		  System.out.println("Palindrome number");		  
	  }
	  else
	  {
		
		  System.out.println("Not palindrome number");
		  break;
	  }
   }
    }
}
public class Palindrome {

	public static void main(String[] args) {
		 P obj=new P();
		    Scanner obj1=new Scanner(System.in);
		    System.out.println("Give me any value");
		    String s=obj1.nextLine();
		    obj.isPal(s);
		    obj1.close();

	}

}
