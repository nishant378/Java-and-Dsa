package recursion;

import java.util.Scanner;
class V
{
	void insertion(int a[],int first,int last)
	{
		if(first!=-1 && last!=a.length)
		{
			if(a[first]>a[last] )
			{
				int temp=a[last];
				a[last]=a[first];
				a[first]=temp;
				insertion(a,first-1,last-1);
			}
			
				insertion(a,first+1,last+1);
		}
	}
}
public class Practice5 {

	public static void main(String[] args) {
		V obj=new V();
	    Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int  n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        obj.insertion(a,0,1);
        for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}

     s.close();

	}

}
