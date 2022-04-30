package arraylist;
import java.util.*;

public class Stacks {

	public static void main(String[] args) {
	Stack<Integer> obj=new Stack<Integer>();
	obj.push(2);
	obj.push(1);
	obj.push(4);
	System.out.println(obj.isEmpty());
   System.out.println(obj.peek());
     System.out.println(obj);
     obj.pop();
     System.out.println(obj);
     System.out.println(obj.search(6));
     System.out.println(obj.search(2));
	}

}
