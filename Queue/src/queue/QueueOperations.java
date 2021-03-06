package queue;
class Queues
{
	int a[]=new int[3];
	int front=-1;
	int rear=-1;
	void enqueue(int data) 
	{
		if(front==-1 && rear==-1)
		{
			front++;
			a[front]=data;
			rear++;
		}
		else
		{
	     if(rear<a.length-1)
		 {
			rear++;
			a[rear]=data;
		 }
		else
		{
			System.out.println("Queue is full");
		}
		}
	}
	
	
	void dequeue()
	{
		if(front==-1)
		{
		    System.out.println("Queue is empty");
		}
		else if(rear>front)
		{
			for(int i=front;i<rear;i++)
			{
				a[i]=a[i+1];			
			}
			rear--;
		}
		else
		{
		   front--;
      		rear--;
		}
	}
	
	void isEmpty()
	{
	       if(front==-1)
	       {
	    	   System.out.println("empty");
	       }
	       else
	       {
	    	   System.out.println("unempty");
	       }
	}
}
public class QueueOperations {

	public static void main(String[] args) {
	
	Queues obj=new Queues();

         obj.isEmpty();
	     obj.enqueue(1);
	    obj.enqueue(2);
	
	    obj.enqueue(3);
        obj.enqueue(7);
	    obj.enqueue(8);
	   obj.dequeue();
	   obj.isEmpty();
       obj.dequeue();
       obj.dequeue();
       obj.dequeue();
       obj.dequeue();
       obj.isEmpty();
       
       
       if(obj.front!=-1)
       {
	for(int i=obj.front;i<=obj.a.length-1;i++)
	{
		System.out.println(obj.a[i]);
	}
       }
       System.out.println("front:"+obj.front);
       System.out.println("Rear:"+obj.rear);
	}

}
