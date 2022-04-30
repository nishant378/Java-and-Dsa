package arrays;
import java.util.Scanner;
public class Array5 {

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
		for(int i=0;i<=4;i++)
		{
		if(a[i]%2==0)
		{
			System.out.println("Even number:"+a[i]);
		}
		else
		{
			System.out.println("Odd number:"+a[i]);
		}
		}
		 obj.close();
		System.out.println("The array is:");
		for(int i=0;i<=4;i++)
		{
			System.out.println("The array of index :"+i+" "+"is:"+a[i]);
		}
	}

}
