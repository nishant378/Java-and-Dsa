package heap;

class MakingQueue
{
	int i=0;
	int front=-1;
	int rear=-1;
	void enqueue(int a[],int data)
	{
		if(i<a.length)
		{
	       a[i]=data;
	       if(front==-1)
	       {
	       front++;
	       }
	       rear++;
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
	
	void dequeue(int a[],int i)
	{
		if(front==0 && rear==0)
		{
			front=-1;
			rear=-1;
		}
		if(i==0 && rear!=-1)
		{
			a[0]=a[rear];
			rear--;
		}
		if(2*i+1<=rear && 2*i+2<=rear)
		{
			if(a[2*i+1]<a[2*i+2])
			{
				if(a[2*i+2]>a[i])
				{
				int temp=a[2*i+2];
				a[2*i+2]=a[i];
				a[i]=temp;
				dequeue(a,2*i+2);
				}
			}
			else if(a[2*i+1]>a[2*i+2])
			{
				if(a[2*i+1]>a[i])
				{
				int temp=a[2*i+1];
				a[2*i+1]=a[i];
				a[i]=temp;
				dequeue(a,2*i+1);
				}
			}
		}
		else if(2*i+1<=rear)
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
public class Problem5 {

	public static void main(String[] args) {
		MakingQueue obj=new MakingQueue();
		int a[]=new int[8];
		obj.enqueue(a,5);
		obj.enqueue(a,4);
		obj.enqueue(a,3);
		obj.enqueue(a,2);
		obj.enqueue(a,8);
		obj.enqueue(a,15);
		obj.enqueue(a,33);
		obj.dequeue(a,0);
		
		System.out.println("front:"+obj.front);
		System.out.println("Rear:"+obj.rear);
		if(obj.front!=-1 && obj.rear!=-1)
		{
       for(int i=obj.front;i<=obj.rear;i++)
       {
    	   System.out.println(a[i]);
       }
		}
	}

}
