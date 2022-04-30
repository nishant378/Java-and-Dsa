package string;

import java.util.Scanner;

public class Sorting3 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	     String a[];
	     a=new String [5];
	     System.out.println("Enter string list:");
	     for(int i=0;i<=4;i++)
	     {
	    	 a[i]=obj.nextLine();
	     }
	     for(int i=1;i<=4;i++)
	     {
	    	 int j=i-1;
	    	 String temp=a[i];
	    	 while(j>=0 && a[j].compareTo(temp)>0)
	    	 {
	    		 a[j+1]=a[j];
	    		 j--;
	    	 }
	    	 a[j+1]=temp;
	     }
	     System.out.println("Sorted list is:");
	     for(int i=0;i<=4;i++)
	     {
	    	 System.out.println(a[i]);
	     }
	     obj.close();

	}

}
