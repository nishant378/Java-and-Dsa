package treeset;
import java.util.*;
public class TreeSets {
//It is based on the 
	public static void main(String[] args) {
		TreeSet<Integer> obj=new TreeSet<Integer>();
		TreeSet<Object> obj1=new TreeSet<Object>(obj);
		obj.add(8);
		obj.add(3);
		obj.add(8);//Heterogeneous is not allowed 
		obj.add(6);
		obj.add(7);
		//obj1.add(new StringBuffer("3"));
		//obj1.add(new StringBuffer("7"));//because StringBuffer not contain comparable interface
		//obj1.add(new StringBuffer("4"));
		//obj1.add(new StringBuffer("3"));
		System.out.println(obj);//Natural Sorting
		System.out.println(obj1);
		
	}
}
