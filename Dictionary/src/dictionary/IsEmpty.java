package dictionary;

import java.util.Dictionary;
import java.util.Hashtable;

public class IsEmpty {

	public static void main(String[] args) {
		Dictionary<Integer,String> obj=new Hashtable<Integer,String>();
		obj.put(2, "Hello");
		System.out.println(obj.isEmpty());
	}

}
