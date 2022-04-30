package set;

import java.util.BitSet;

public class AndNot {

	public static void main(String[] args) {
		BitSet obj=new BitSet();
		BitSet obj1=new BitSet();
		obj.set(3);
		obj.set(8);
		
		
		obj1.set(3);
		obj1.set(1);
		obj1.set(2);
		//And method
		obj.andNot(obj1);
		System.out.println(obj);
	}

}
