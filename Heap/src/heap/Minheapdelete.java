package heap;

class MinHeapDelete
{
	int j;
	void delete(int a[],int i)
	{
		if(i==0 && j!=-1)
		{
			a[0]=a[j];
			j--;
		}
		if(2*i+1<=j && 2*i+2<=j)
		{
			if(a[2*i+1]>a[2*i+2])
			{
				if(a[2*i+2]<a[i])
				{
				int temp=a[2*i+2];
				a[2*i+2]=a[i];
				a[i]=temp;
				delete(a,2*i+2);
				}
			}
			else if(a[2*i+1]<a[2*i+2])
			{
				if(a[2*i+1]<a[i])
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
			if(a[2*i+1]<a[i])
			{
				int temp=a[2*i+1];
				a[2*i+1]=a[i];
				a[i]=temp;
			}
		}
	}
	}

public class Minheapdelete {

	public static void main(String[] args) {
		MinHeapDelete obj=new MinHeapDelete();
		int a[]= {13,50,60,70,80};
		obj.j=a.length-1;
		obj.delete(a,0);
	
		System.out.println("J:"+obj.j);
		
		for(int i=0;i<=obj.j;i++)
		{
			System.out.println(a[i]);
		}

	}

}
