package string;
import java.util.Scanner;
public class Sorting2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String  a[];
		a=new String [5];
		System.out.println("Enter string list:");
		for(int i=0;i<=4;i++){
			a[i]=obj.nextLine();
		}
		for(int i=0;i<=4;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
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
