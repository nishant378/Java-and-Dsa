package string;
import java.util.Scanner;
public class Searching2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a[];
		a=new String [5];
		System.out.println("Enter String list:");
		for(int i=0;i<=4;i++)
		{
		a[i]=obj.nextLine();
		}
		System.out.println("Enter search element:");
		String search=obj.nextLine();
		int first=0;
		int last=4;
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(a[mid].compareTo(search)<0)
			{
				first=mid+1;
				mid=(first+last)/2;
			}
			else
			{
				if(a[mid].equals(search))
				{
					System.out.println("found!!");
					break;
				}
				else
				{
					last=mid-1;
					mid=(first+last)/2;
				}
			}
		}
		if(first>last){
			System.out.println("Not found!!");
		}
		obj.close();
	}

}
