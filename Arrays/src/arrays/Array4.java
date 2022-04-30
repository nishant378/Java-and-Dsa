package arrays;
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[];
		a=new int [5];
		int avg,s=0;
		System.out.println("Enter Array:");
		for(int i=0;i<=4;i++)
		{
			int value=obj.nextInt();
			a[i]=value;
			s=s+a[i];
		}
		avg=s/5;
		 obj.close();
		System.out.println("The array is:");
		for(int i=0;i<=4;i++)
		{
			System.out.println("The element of index "+ i +" "+ "is:"+" "+a[i]);
		}
		System.out.println("Average element of each block is:"+avg);
	}

}
