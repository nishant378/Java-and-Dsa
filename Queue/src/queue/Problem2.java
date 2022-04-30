package queue;
import java.util.*;
class ReverseQueue
{	
	Queue<Integer> queue=new LinkedList<>();
	Stack<Integer> stack=new Stack<Integer>();
	void reversequeue()
	{
		while(!queue.isEmpty())
		{
			stack.push(queue.remove());
		}
		
		while(!stack.isEmpty())
		{
		       queue.add(stack.pop());
		}
	}
}
public class Problem2 {

	public static void main(String[] args) {
		ReverseQueue obj=new ReverseQueue();
	    obj.queue.add(1);
	    obj.queue.add(2);
	    obj.queue.add(3);
	    System.out.println("Before Reverse:"+obj.queue);
	     obj.reversequeue();
	   System.out.println("After Reverse:"+obj.queue);
	}

}
