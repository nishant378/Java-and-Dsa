package recursion;

import java.util.Scanner;

class J
{
	int p=1;
	void bubble(int a[],int first,int last)
	{			
		  if(last!=a.length)
		  {
			  if(a[first]>a[last])
			  {
				  int temp=a[first];
				  a[first]=a[last];
				  a[last]=temp;	
			  }
			  bubble(a,first+1,last+1);			 
		  }
		  if(p!=a.length)
		  {
			  p=p+1;
				  bubble(a,0,1);
		  }
	} 
}
public class Practice6 {

	public static void main(String[] args) {
	      J obj=new J();
	      Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        int  n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        obj.bubble(a,0,1);
	        for(int i=0;i<=a.length-1;i++)
			{
				System.out.println(a[i]);
			}
          s.close();
	}

}
