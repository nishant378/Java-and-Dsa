package heap;

class MaxheapInsert
{
	int i=0;
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
}
public class MaxHeap {

	public static void main(String[] args) {
		MaxheapInsert obj=new MaxheapInsert();
		int a[]=new int[8];
		obj.insert(a,9);
        obj.insert(a,5);
        obj.insert(a,15);
        obj.insert(a,3);
        obj.insert(a,10);
        obj.insert(a,18);
        obj.insert(a,6);
        obj.insert(a,44);
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
	}

}
