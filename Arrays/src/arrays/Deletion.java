package arrays;
import java.util.Scanner;
public class Deletion {

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
		System.out.println("Enter position to be deleted:");
		int position=obj.nextInt();
		for(int i=position;i<=4;i++)
		{
			a[i-1]=a[i];
		}
		 obj.close();
		System.out.println("The array is:");
		for(int i=0;i<=3;i++)
		{
			System.out.println(a[i]);
		}
	}

}
