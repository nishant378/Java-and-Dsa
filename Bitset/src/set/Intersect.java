package set;

import java.util.BitSet;

public class Intersect {

	public static void main(String[] args) {
	BitSet obj=new BitSet();
	BitSet obj1=new BitSet();
		obj.set(3);
		obj.set(8);
		
		obj1.set(3);
		obj1.set(8);
		obj1.set(7);
        System.out.println(obj.intersects(obj1));
	}

}
