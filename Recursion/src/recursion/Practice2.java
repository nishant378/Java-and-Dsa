package recursion;
import java.util.Scanner;
class K
{
	void selection(int b[],int startindex,int lastindex)
	{
		if(lastindex<b.length)
		{
			if(b[startindex]>b[lastindex])
			{
			int temp=b[lastindex];
			b[lastindex]=b[startindex];
			b[startindex]=temp;
			}
			else
			{
				selection(b,startindex,lastindex+1);
			}	
			selection(b,startindex+1,lastindex+1);	
		}
		  	}
}
public class Practice2 {

	public static void main(String[] args) {
		K obj=new K();
	    Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int  n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        obj.selection(a,0,1);
        for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}

     s.close();
	}

}
