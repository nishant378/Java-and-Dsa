package vector;

import java.util.Vector;

public class Contains {

	public static void main(String[] args) {
		Vector<Integer> obj=new Vector<Integer>();
		Vector<Integer> obj1=new Vector<Integer>();
       obj.add(2);
       obj1.add(2);
         System.out.println(obj.contains(obj1));
	}

}
