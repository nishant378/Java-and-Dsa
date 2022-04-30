package arrays;
import java.util.Scanner;
public class Searching1 {

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
		int first=0;
		int last=4;
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(a[mid]<search)
			{
				first=mid+1;
				mid=(first+last)/2;
			}
			else
			{
				if(a[mid]==search)
				{
					System.out.println("found!!");
					break;
				}
				else
				last=mid-1;
					mid=(first+last)/2;
				
			}
		}
		if(first>last)
		{
			System.out.println("Not found!!");
		}
		obj.close();
	}

}
