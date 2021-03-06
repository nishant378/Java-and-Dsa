package linkedlist;

class MakingQueue
{
	int front=0;
	int rear=0;
	Node start=new Node();
	Node c=new Node();
	class Node
	{
		int data;
		Node next;
	}
	
	void enqueue(int data)
	{
		if(front==0 && rear==0)
		{
			start.data=data;
			start.next=null;
			c=start;
			front++;
			rear++;
		}
		else
		{
			c=start;
			Node newnode=new Node();
			newnode.data=data;
			newnode.next=null;
			while(c.next!=null)
			{
				c=c.next;
			}
			c.next=newnode;
			c=newnode;
			rear++;
		}
	}
	void dequeue()
	{
		if(front==0)
		{
			System.out.println("we can't dequeue");
		}
		if(rear!=0)
		{
		c=start;
		start=start.next;
		c.next=null;
		c=start;
		rear--;
		}
		if(rear==0)
		{
			front=0;
		}
	}
	
	void display()
	{
		c=start;
		while(c!=null && front!=0)
		{
			System.out.println("data:"+c.data);
			c=c.next;
		}
	}
}
public class Problem2 {

	public static void main(String[] args) {
	   MakingQueue obj=new MakingQueue();
	 obj.enqueue(1);
      obj.enqueue(2);
       obj.enqueue(3);
       obj.dequeue();
       obj.display();
       System.out.println("rear:"+obj.rear);
       System.out.println("front:"+obj.front);
	}

}
