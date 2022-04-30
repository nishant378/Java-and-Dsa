package heap;

class MaxFromMinHeap
{
	int j;
	int p;
	void heapifyForMax(int a[])
	{
		if(j>=0)
		{
		if(2*j+1<=a.length-1 && 2*j+2<=a.length-1)
		{
			if(a[2*j+1]<a[2*j+2])
			{
				if(a[2*j+2]>a[j])
				{
				int temp=a[2*j+2];
				a[2*j+2]=a[j];
				a[j]=temp;
				}
			}
			else if(a[2*j+1]>a[2*j+2])
			{
				if(a[2*j+1]>a[j])
				{
				int temp=a[2*j+1];
				a[2*j+1]=a[j];
				a[j]=temp;
				}
			}
		}
		else if(2*j+1<=a.length-1)
		{
			if(a[2*j+1]>a[j])
			{
				int temp=a[2*j+1];
				a[2*j+1]=a[j];
				a[j]=temp;
			}
		}
		}
		j--;
		if(j>=0)
		{
		heapifyForMax(a);
		}
		p=a[0];
	}
	
	int  GetMax()
	{
		return p;
	}
}
public class Problem1 {

	public static void main(String[] args) {
		MaxFromMinHeap obj=new MaxFromMinHeap();
		int a[]= {3,5,4,10,8,6,9};;
		for(int i=0;i<a.length;i++)
		{
		obj.j=a.length-1;
		obj.heapifyForMax(a);
		}
		System.out.println("Getmax:"+obj.GetMax());
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
