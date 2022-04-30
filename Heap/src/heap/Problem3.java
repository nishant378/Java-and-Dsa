package heap;
 //check if a given binary tree is heap
class isMaxheap
{
	int flag=0;
	void IsMaxheap(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[(i-1)/2])
			{
				flag=1;
			}
			if(a[i]==0)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("false");
		}
		else if(flag==0)
		{
			System.out.println("true");
		}
	}
}
public class Problem3 {

	public static void main(String[] args) {
		isMaxheap obj=new isMaxheap();
		int a[]= {97,46,37,12,3,7,31,6,9};
          obj.IsMaxheap(a);
	}

}
