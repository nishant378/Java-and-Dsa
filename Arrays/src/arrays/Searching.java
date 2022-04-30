package arrays;
import java.util.Scanner;
public class Searching {
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
		System.out.println("Enter search element:");
		int search=obj.nextInt();
		for(int i=0;i<=4;i++)
		{
			if(a[i]==search)
			{
				System.out.println("found!!");
			}
			else
			System.out.println("Not found!!");
		}
		obj.close();
	}
}
