package heap;

class HeapSort
{
	int i=0;
	int j;
	void insert(int a[],int data)
	{
		if(i<a.length)
		{
	       a[i]=data;
	       if(i!=0)
			{
				adjust(a,i);
			}
	       i++;
		}
		
	}
	
	void adjust(int a[],int i) 
	{
		   if(a[(i-1)/2]<a[i])
		   {
			   int temp=a[(i-1)/2];
			   a[(i-1)/2]=a[i];
			   a[i]=temp;
		   }
		   if(i!=0)
		   {
			   adjust(a,(i-1)/2);
		   }
	}
	void delete(int a[],int i)
	{
		if(i==0 && j!=-1)
		{
			int temp=a[0];
			a[0]=a[j];
			a[j]=temp;
			j--;
		}
		if(2*i+1<=j && 2*i+2<=j)
		{
			if(a[2*i+1]<a[2*i+2])
			{
				if(a[2*i+2]>a[i])
				{
				int temp=a[2*i+2];
				a[2*i+2]=a[i];
				a[i]=temp;
				delete(a,2*i+2);
				}
			}
			else if(a[2*i+1]>a[2*i+2])
			{
				if(a[2*i+1]>a[i])
				{
				int temp=a[2*i+1];
				a[2*i+1]=a[i];
				a[i]=temp;
				delete(a,2*i+1);
				}
			}
		}
		else if(2*i+1<=j)
		{
			if(a[2*i+1]>a[i])
			{
				int temp=a[2*i+1];
				a[2*i+1]=a[i];
				a[i]=temp;
			}
		}
	}
}
public class Heapsort {

	public static void main(String[] args) {
		HeapSort obj=new HeapSort();
		int a[]=new int[5];
		obj.insert(a,10);
        obj.insert(a,20);
        obj.insert(a,15);
        obj.insert(a,30);
        obj.insert(a,40);
        
        obj.j=a.length-1;
        for(int i=0;i<a.length;i++)
        {
        	obj.delete(a,0);
        }

         System.out.println("J:"+obj.j);
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
