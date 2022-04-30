package sortedset;
import java.util.*;
public class SortedSet {

	public static void main(String[] args) {
		TreeSet<Integer> obj=new TreeSet<Integer>();
        obj.add(11);
        obj.add(2);
        obj.add(5);
        obj.add(7);
        System.out.println(obj);
        System.out.println(obj.first());
        System.out.println(obj.last());
        System.out.println(obj.headSet(11));
        System.out.println(obj.tailSet(4));
        System.out.println(obj.subSet(2,7));
        System.out.println(obj.comparator());
	}

}
