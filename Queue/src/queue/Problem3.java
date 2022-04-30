package queue;
import java.util.*;
class TwoQueue
{
	Queue<Integer> queue1=new LinkedList<>();
	Queue<Integer> queue2=new LinkedList<>();
	int a;
	void push(int data)
	{
		while(!queue1.isEmpty())
		{
			queue2.add(queue1.remove());
		}
		queue1.add(data);
		while(!queue2.isEmpty())
		{
			queue1.add(queue2.remove());
		}
	}
	
	int  pop()
	{
		if(!queue1.isEmpty())
		{
			a=queue1.remove();
		}
		else
		{
			System.out.println("stack is empty");
		}
		return a;
	}
	
	int peek()
	{
	      if(!queue1.isEmpty())
	      
	    	 a=queue1.peek();
	      return a;
	}
}
public class Problem3 {

	public static void main(String[] args) {
	
		TwoQueue obj=new TwoQueue();
		obj.push(5);
		obj.push(10);
		obj.push(15);
		
	
		System.out.println(obj.queue1);
		System.out.println("Peek:"+obj.peek());
		System.out.println("Pop element:"+obj.pop());
		System.out.println(obj.queue1);
		System.out.println("Peek:"+obj.peek());
		System.out.println("Pop element:"+obj.pop());
		System.out.println(obj.queue1);
		System.out.println("Peek:"+obj.peek());
		
	}

}
