package heap;

class MinHeapInsert
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
		   if(a[(i-1)/2]>a[i])
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
public class MinheapInsert {

	public static void main(String[] args) {
		MinHeapInsert obj=new MinHeapInsert();
		int a[]=new int[5];
		obj.insert(a,70);
        obj.insert(a,15);
        obj.insert(a,30);
        obj.insert(a,6);
        obj.insert(a,4);
      
        for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }

	}

}
