package heap;

class Heapifymin
{
	int j;
	void heapifyForMin(int a[])
	{
		if(j>=0)
		{
		if(2*j+1<=a.length-1 && 2*j+2<=a.length-1)
		{
			
			if(a[2*j+1]>a[2*j+2])
			{
				if(a[2*j+2]<a[j])
				{
				   int temp=a[2*j+2];
				   a[2*j+2]=a[j];
				   a[j]=temp;
				}
			}
			else if(a[2*j+1]<a[2*j+2])
			{
				if(a[2*j+1]<a[j])
				{
				int temp=a[2*j+1];
				a[2*j+1]=a[j];
				a[j]=temp;
				}
			}
		}
		else if(2*j+1<=a.length-1)
		{
			if(a[2*j+1]<a[j])
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
		heapifyForMin(a);
		}
	}
}
public class HeapifyMin {

	public static void main(String[] args) {
		Heapifymin obj=new Heapifymin();
		int a[]= {17,11,3,5,4,2};
		for(int i=0;i<a.length;i++)
		{
		obj.j=a.length-1;
		obj.heapifyForMin(a);
		}   
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
