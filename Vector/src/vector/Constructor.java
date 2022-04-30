package vector;
import java.util.*;
public class Constructor {

	public static void main(String[] args) {
		Vector<Integer> obj=new Vector<Integer>();
		Vector<Integer> obj1=new Vector<Integer>(3);
		Vector<Integer> obj2=new Vector<Integer>(2,29);
		Vector<Integer> obj3=new Vector<Integer>(obj2);
	    System.out.println(obj);
	    System.out.println(obj.capacity());
	    System.out.println(obj1);
	    System.out.println(obj1.capacity());
	    System.out.println(obj2);
	    System.out.println(obj2.capacity());
	    System.out.println(obj3);
	    System.out.println(obj3.capacity());
	}

}
