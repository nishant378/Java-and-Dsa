package arrays;
import java.util.Scanner;
public class Insertion2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[];
		a=new int [5];
         System.out.println("Enter array:");
         for(int i=0;i<=4;i++)
         {
        	 int value=obj.nextInt();
        	 a[i]=value;
         }
         System.out.println("Enter data to be inserted:");
         int data=obj.nextInt();
         a[4]=data;
         obj.close();
         System.out.println("The array is:");
         for(int i=0;i<=4;i++)
         {
        	 System.out.println(a[i]);
         }
	}

}
