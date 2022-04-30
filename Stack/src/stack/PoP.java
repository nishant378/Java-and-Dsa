package stack;
import java.util.*;
public class PoP {

	public static void main(String[] args) {
	Stack<Integer> obj =new Stack<Integer>();
	obj.push(2);
	obj.push(5);
	obj.push(3);
	
	obj.pop();
      System.out.println(obj.size());
	}

}
