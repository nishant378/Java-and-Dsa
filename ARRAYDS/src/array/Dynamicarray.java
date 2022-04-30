package array;
import java.util.Scanner;

public class Dynamicarray {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	    int temp[]=null;
		int a[]=new int[1];
		System.out.println("Enter array");
		for(int i=0;i<=5;i++)
		{
			if(a.length==i)
			{				
					 temp=new int[a.length*2];
					for(int j=0;j<a.length;j++)
					{
						temp[j]=a[j];	
					}				
					a=temp;
				
			}
			a[i]=obj.nextInt();	
		}
		System.out.println("Resulted array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
     obj.close();
	}

}
