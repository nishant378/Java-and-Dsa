package queue;

class CircularQueues
{
	int front=-1;
	int rear=-1;
	 int a[]=new int[5];
	void enqueue(int data)
	{
		if((front==0 && rear==a.length-1) || front==rear+1)
        {
	          System.out.println("Queue is full");
        }
		else if(front==-1 && rear==-1)
		{
			front++;
			a[front]=data;
			rear++;
		}
		else if(rear<a.length-1)
		{
			rear++;
			a[rear]=data;
		}
		else 
		{
			rear=-1;
			enqueue(data);
		}
	}
	
	void dequeue()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is empty");
		}
		else if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(front<a.length-1)
		{
			front=front+1;
		}
		else
		{
			front=0;
		}
	}
	
	void display()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("there is no element");
		}
		if(front<=rear)
		{
		     while(front<=rear)
		    {
			System.out.println(a[front]);
			front++;
		    }
		}
		else
		{
		while(front<a.length)
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
public class Problem6 {

	public static void main(String[] args) {
	     CircularQueues obj=new CircularQueues();
	     obj.enqueue(10);
	     obj.enqueue(20);
	     obj.enqueue(30);
	     obj.enqueue(40);
	     obj.enqueue(50);
	     obj.enqueue(60);
	     obj.dequeue();
	     obj.dequeue();
	      obj.enqueue(60);
	      obj.enqueue(70);
	      obj.enqueue(80);
	     obj.dequeue();
	     obj.dequeue();
	      
	  
	     System.out.println("front:"+obj.front);
	     System.out.println("Rear:"+obj.rear);
	       obj.display();
	}

}
