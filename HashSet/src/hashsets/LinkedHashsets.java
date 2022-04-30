package hashsets;
import java.util.*;
public class LinkedHashsets {

	public static void main(String[] args) {
	LinkedHashSet<String> obj=new LinkedHashSet<String>();
     obj.add("one");
     obj.add("two");//the difference between hashset and linkedhashset is, Hashset doesn't have insertion order but LinkedHashset has insertion order
     obj.add("three");
     obj.add("four");
     obj.add("five");
     obj.add("one");//duplicates not allowed
     System.out.println(obj);
     System.out.println(obj.isEmpty());
     System.out.println(obj.parallelStream());
     
	}

}
