package queue;
import java.util.*;
class ReverseQueues
{
	int i=1;
	Stack<Integer> stack=new Stack<Integer>();
	Queue<Integer> queue2=new LinkedList<>();
	void reverse(Queue<Integer> queue, int k)
	{
		while(i<=k)
		{
			stack.push(queue.remove());
			i++;
		}
		while(!stack.isEmpty())
		{
			queue2.add(stack.pop());
		}
		while(!queue.isEmpty())
		{
			queue2.add(queue.remove());
		}
	}
}
public class Problem5 {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		   Queue<Integer> queue=new LinkedList<>();
		   ReverseQueues rq=new ReverseQueues();
		   queue.add(10);
		   queue.add(20);
		   queue.add(30);
		   queue.add(40);
		   queue.add(50);
		   queue.add(60);
		   queue.add(70);
		   queue.add(80);
		   queue.add(90);
		   System.out.println("Enter the value of k");
		   int k=obj.nextInt();
		   rq.reverse(queue,k);
		   System.out.println(rq.queue2);
		   obj.close();

	}

}
