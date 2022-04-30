package arrays;
import java.util.Scanner;
public class Sorting3 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[];
		a=new int [5];
	System.out.println("Enter array list:");
     for(int i=0;i<=4;i++)
     {
    	 int value=obj.nextInt();
    	 a[i]=value;
     }
     for(int i=1;i<=4;i++)
     {
    	 int temp=a[i];
    	 int j=i-1;
    	 while(j>=0 && a[j]>temp)
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
     System.out.println("Correct hai yaar!!");
     obj.close();
	}

}
