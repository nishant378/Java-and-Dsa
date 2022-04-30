package stack;
import java.util.*;
public class Search {

	public static void main(String[] args) {
	Stack<Integer> obj=new Stack<Integer>();
	Stack<Integer> obj1=new Stack<Integer>();
    obj1.push(2);
    obj1.push(2);
    obj.push(2);
    obj.push(2);
      System.out.println(obj.search(obj1));
	}

}
