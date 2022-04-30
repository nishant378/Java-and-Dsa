package set;

import java.util.BitSet;

public class FlipSE {

	public static void main(String[] args) {
	BitSet obj=new BitSet();
		
		obj.set(3);
		obj.set(8);
		obj.flip(3,8);
      	System.out.println(obj);
	}

}
