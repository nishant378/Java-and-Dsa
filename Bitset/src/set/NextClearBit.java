package set;

import java.util.BitSet;

public class NextClearBit {

	public static void main(String[] args) {
		BitSet obj=new BitSet();
		
		obj.set(3);
		obj.set(8);
		
		
		
		System.out.println(obj.nextClearBit(8));
		System.out.println(obj.nextClearBit(5));
	}

}
