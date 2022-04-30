package set;

import java.util.BitSet;

public class Get {

	public static void main(String[] args) {
	BitSet obj=new BitSet();
		
		obj.set(3);
		obj.set(8);
               System.out.println(obj.get(2,6));
	}

}
