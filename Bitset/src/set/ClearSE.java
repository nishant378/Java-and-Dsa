package set;

import java.util.BitSet;

public class ClearSE {

	public static void main(String[] args) {
		BitSet obj=new BitSet();
	
		obj.set(3);
		obj.set(8);
		obj.set(9);
		obj.set(2);
		
		
		obj.clear(3,9);
		System.out.println(obj);

	}

}
