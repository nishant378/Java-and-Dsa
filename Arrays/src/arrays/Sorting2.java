package arrays;
import java.util.Scanner;
public class Sorting2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        int a[];
        a=new int [5];
        System.out.println("Enter array list:");
        for(int i=0;i<=4;i++)
        {
        	int value=obj.nextInt();
        	a[i]=value;
        }
        for(int i=0;i<=4;i++)
        {
        	for(int j=i+1;j<=4;j++)
        	{
        		if(a[i]>a[j])
        		{
        		int temp=a[i];
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
