package arrays;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		 int sum=0;
		int a[];
		a=new int [5];
		System.out.println("Enter array:");
       for(int i=0;i<=4;i++)
       {
    	   int value=obj.nextInt();
    	   a[i]=value;
    	   sum=sum+a[i];
       }
       obj.close();
      System.out.println("The sum  is:");
     System.out.println(sum);
	}
}
