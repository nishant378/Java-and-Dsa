package set;

import java.util.BitSet;

public class ClearI {

	public static void main(String[] args) {
		BitSet obj=new BitSet();
		
		obj.set(3);
		obj.set(8);
		obj.set(7);
		obj.set(9);
		obj.clear(8);
		System.out.println(obj);

	}

}
