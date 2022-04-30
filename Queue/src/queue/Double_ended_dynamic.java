package queue;

class dynamic
{
	int a[]=new int[3];
	int front=-1;
	int rear=-1;
	
	void push_rear(int data)
	{
		if(front==-1)
		{
			front++;
			int temp[]=new int[1];
			a=temp;
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
			int temp[]=new int[a.length+1];
			for(int i=0;i<a.length;i++)
			{
				temp[i]=a[i];
			}
			a=temp;
			push_rear(data);
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
			int temp[]=new int[0];
			a=temp;
		}
		else
		{
			rear=rear-1;
			int temp[]=new int [a.length-1];
			for(int i=front;i<=rear;i++)
			{
				temp[i]=a[i];
			}
			a=temp;
		}
	}
	
	void push_front(int data)
	{
		if(front==-1)
		{
			front++;
			int temp[]=new int[1];
			a=temp;
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
			int temp[]=new int[a.length+1];
			for(int i=0;i<a.length;i++)
			{
				temp[i]=a[i];
			}
			a=temp;
			push_front(data);
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
			int temp[]=new int[0];
			a=temp;
		}
		else
		{
			front=front+1;
			int temp[]=new int[a.length-1];
			for(int i=front;i<a.length;i++) {
				temp[i-1]=a[i];
			}
			a=temp;
			front--;
			rear--;
		}
	}
}
public class Double_ended_dynamic {

	public static void main(String[] args) {
		dynamic obj=new dynamic();
		   obj.push_front(10);
		   obj.push_front(20);
		   obj.push_front(30);
		   obj.push_front(40);
		   obj.push_front(50);
		   
			obj.pop_front();
		    obj.push_rear(100);
		    obj.pop_rear();
		    obj.pop_rear();
		    obj.pop_rear();
		    obj.pop_rear();
		    obj.pop_rear();
		    obj.push_rear(200);
		   if(obj.front!=-1)
		   {
		   for(int i=obj.front;i<=obj.rear;i++)
		   {
			   System.out.println(obj.a[i]);
		   }
		   }
		   System.out.println("front:"+obj.front);
		   System.out.println("rear:"+obj.rear);
		   System.out.println("a.length:"+obj.a.length);


	}

}
