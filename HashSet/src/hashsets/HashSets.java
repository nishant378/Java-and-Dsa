package hashsets;
import java.util.*;
public class HashSets {

	public static void main(String[] args) {
		HashSet<String> obj=new HashSet<String>();
		obj.add("one");
		obj.add("two");
		obj.add("three");
		obj.add("four");
		obj.add("five");//Insertion order is not preserved
		obj.add("one");//duplicates value is not inserted in HashSet
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println(obj.getClass());
        System.out.println(obj.iterator());
	}
}
