package heap;

class HeapifyMaxx
{
	void heapify(int a[],int i)
	{
		if(2*i+1<=a.length-1 && 2*i+2<=a.length-1)
		{
			if(a[2*i+1]<a[2*i+2])
			{
				if(a[2*i+2]>a[i])
				{
				int temp=a[2*i+2];
				a[2*i+2]=a[i];
				a[i]=temp;
				}
			}
			else if(a[2*i+1]>a[2*i+2])
			{
				if(a[2*i+1]>a[i])
				{
				int temp=a[2*i+1];
				a[2*i+1]=a[i];
				a[i]=temp;
				}
			}
		}
		else if(2*i+1<=a.length-1)
		{
			if(a[2*i+1]>a[i])
			{
				int temp=a[2*i+1];
				a[2*i+1]=a[i];
				a[i]=temp;
			}
		}
		
		i--;
		if(i>=0)
		{
		heapify(a,i);
		}
	}
}
public class Heapifymax {

	public static void main(String[] args) {
		HeapifyMaxx obj=new HeapifyMaxx();
	int a[]= {3,5,4,10,8,6};	
	int j=a.length-1;
      for(int i=j/2;i>=0;i--)
      {
	     obj.heapify(a,i);
      }
      
      for(int i=0;i<a.length;i++)
      {
    	  System.out.println(a[i]);
      }
	}

}
