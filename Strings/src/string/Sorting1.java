package string;
import java.util.Scanner;
public class Sorting1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a[];
		a=new String [5];
		System.out.println("Enter String list:");
		for(int i=0;i<=4;i++)
		{
		a[i]=obj.nextLine();
		}
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=3-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String temp=a[j];
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

