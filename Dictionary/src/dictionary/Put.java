package dictionary;

import java.util.Dictionary;
import java.util.Hashtable;

public class Put {

	public static void main(String[] args) {
		Dictionary<Integer,String> obj=new Hashtable<Integer,String>();
		
		obj.put(6,"ty");
		System.out.println(obj);
	}

}
