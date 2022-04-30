package queue;
class double_ended
{
	int a[]=new int[3];
	int front=-1;
	int rear=-1;
	
	void push_rear(int data)
	{
		if(front==-1)
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
			System.out.println("Queue is full");
		}
	}
	
	
	void pop_rear() {
		
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			rear=rear-1;
		}
	}
	
	void push_front(int data)
	{
		if(front==-1)
		{
			front++;
			a[front]=data;
			rear++;
		}
		else if(a.length-1!=rear)
		{
			for(int i=a.length-2;i>=0;i--)
			{
				a[i+1]=a[i];
			}
			a[front]=data;
			rear++;
		}
		else
		{
			System.out.println("Queue is full");
		}
	}
	
	void pop_front()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			front=front+1;
			for(int i=front;i<=rear;i++)
			{
				a[i-1]=a[i];
			}
			front--;
			rear--;
		}
	}
}
public class DoubleEnded {

	public static void main(String[] args) {
		   double_ended obj=new double_ended();
		   obj.push_front(10);
		   obj.push_front(20);
		   obj.push_front(30);
		  obj.push_front(40);
		   obj.pop_front();
		 obj.pop_front();
		  obj.pop_front();
		   obj.pop_front();
		   obj.pop_front();
		   obj.push_rear(50);
		   obj.push_rear(60);
		   obj.push_rear(70);
		   obj.push_rear(80);
		   obj.push_rear(90);
		   obj.pop_rear();
		   obj.pop_rear();
		   obj.pop_rear();
		   obj.pop_rear();
		   obj.pop_rear();
		   if(obj.front!=-1)
		   {
		   for(int i=obj.front;i<=obj.rear;i++)
		   {
			   System.out.println(obj.a[i]);
		   }
		   }
		   System.out.println("front:"+obj.front);
		   System.out.println("rear:"+obj.rear);

	}

}
