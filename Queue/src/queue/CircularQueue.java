package queue;
class Circular
{
	int a[]=new int[3];
	int front=-1;
	int rear=-1;
	void enqueue(int data)
	{
		if((front==0 && rear==a.length-1)||(front==rear+1))
		{
			System.out.println("Queue Overflow");
			return;
		}
	    if(front==-1)
		{
		    front=0;
		    rear=0;
		}
		else 
			{
			if(rear==a.length-1)
			    rear=0;
			else
				rear=rear+1;
		}
	    a[rear]=data;
	}
	
	void dequeue()
	{
		if(front==-1)
		{
		   System.out.println("Queue underflow");
		   return;
		}
			if(front==rear)
		    {
                   front=-1;
               rear=-1;
		    }
			else 
			{
				if(front==a.length-1)
					front=0;
				else 
					front=front+1;
			}
	}
	
	
	
	void display()
	{
		if(front==-1)
		{
			System.out.println("queue is empty");
			return;
		}
		if(front<=rear)
		
			while(front<=rear)
			{
				System.out.println(a[front]);
				front++;
			}
		else 
		{
		    while(front<=a.length-1)
		    {
		    	System.out.println(a[front]);
		    	front++;
		    }
		    front=0;
		    while(front<=rear)
		    {
		    	System.out.println(a[front]);
		    	front++;
		    }
		}
	}
}
public class CircularQueue {

	public static void main(String[] args) {
	      
		Circular obj=new Circular();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(1);
        obj.dequeue();
       obj.dequeue();
     
       System.out.println("front:"+obj.front);

           System.out.println("Rear:"+obj.rear);
         obj.display();
	}

}
