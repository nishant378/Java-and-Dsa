package queue;
class Dynamicqueue
{
	int a[]=new int[1];
	int front=-1;
	int rear=-1;
	   void enqueue(int data)
       {
		if(front==-1 && rear==-1)
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
			enqueue(data);
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
			   int temp[]=new int[a.length-1];
			   for(int i=front;i<=rear;i++)
			   {
				   temp[i]=a[i];
			   }
			   a=temp;
		   }
		   
		   else 
		   {
			   front--;
			   rear--;
			   int temp[]=new int[0];
			   a=temp;
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
public class DynamicQueue {

	public static void main(String[] args) {
	Dynamicqueue obj=new Dynamicqueue();
      obj.enqueue(10);
      obj.enqueue(20);
      obj.enqueue(30);
      obj.enqueue(40);
       obj.enqueue(50);
     obj.dequeue();
     obj.dequeue();
     obj.dequeue();
     obj.dequeue();
     obj.dequeue();
     obj.dequeue();
    obj.enqueue(555);
    
     obj.enqueue(40);
     obj.dequeue();
     obj.dequeue();
     obj.dequeue();
     obj.isEmpty();
      if(obj.front!=-1)
      {
      for(int i=obj.front;i<=obj.rear;i++)
      {
    	  System.out.println(obj.a[i]);
      }
      }
      System.out.println("front:"+obj.front);
      System.out.println("Rear:"+obj.rear);
      System.out.println("length:"+obj.a.length);
	}

}
