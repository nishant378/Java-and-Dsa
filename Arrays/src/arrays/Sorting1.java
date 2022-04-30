package arrays;
import java.util.Scanner;
public class Sorting1 {

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
		for(int j=0;j<=3-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println("Sorted list is:");
	for(int i=0;i<=4;i++)
	{
		System.out.println(a[i]);
	}
obj.close();
	}

}
