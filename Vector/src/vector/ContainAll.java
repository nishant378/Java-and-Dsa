package vector;

import java.util.Vector;

public class ContainAll {

	public static void main(String[] args) {
		Vector<Integer> obj=new Vector<Integer>();
		Vector<Integer> obj1=new Vector<Integer>();
		obj.add(2);
		System.out.println(obj.containsAll(obj1));
	}
}
