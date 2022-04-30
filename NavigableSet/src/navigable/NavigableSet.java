package navigable;
import java.util.*;
public class NavigableSet {

	public static void main(String[] args) {
	TreeSet<Integer> obj=new TreeSet<Integer>();
	 obj.add(11);
     obj.add(2);
     obj.add(5);
     obj.add(7);
     System.out.println(obj.ceiling(7));
     System.out.println(obj.floor(8));
     System.out.println(obj.higher(7));
     System.out.println(obj.lower(8));
     System.out.println(obj.pollFirst());
     System.out.println(obj.pollLast());
	}

}
