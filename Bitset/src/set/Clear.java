package set;

import java.util.BitSet;

public class Clear {

	public static void main(String[] args) {
		BitSet obj=new BitSet();
		BitSet obj1=new BitSet();
		obj.set(3);
		obj.set(8);
		
		obj1.set(1);
		obj1.set(3);
		obj1.set(1);
		obj1.set(2);
	
		obj.clear();
		System.out.println(obj);
	}

}