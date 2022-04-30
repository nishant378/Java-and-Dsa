package priorityQueue;
import java.util.*;
public class PriorityQueues {

	public static void main(String[] args) {
		PriorityQueue<Integer> obj=new PriorityQueue<Integer>();
         obj.add(2);
         obj.add(1);
         obj.add(9);
         obj.add(1);
         obj.add(7);
         System.out.println(obj);
         System.out.println(obj.remove());//these elements remove sequentially but they're not insert sequentially
         System.out.println(obj.remove());
         System.out.println(obj.remove());
         System.out.println(obj.remove());
         System.out.println(obj.remove());
         System.out.println(obj.offer(3));
         System.out.println(obj.offer(4));
         System.out.println(obj);
         System.out.println(obj.poll());
         System.out.println(obj.add(5));
         System.out.println(obj.add(2));
         System.out.println(obj.peek());
         System.out.println(obj.element());
	}

}
