package map;
import java.util.*;
public class Maps {

	public static void main(String[] args) {
		HashMap <String,String> obj=new HashMap<String ,String>();
            obj.put("A","B");
            obj.put("3","2");
            obj.put("1","4");
            obj.put("y","x");
            obj.put(null,null);
            System.out.println(obj);
           System.out.println(obj.remove("A"));
            System.out.println(obj.get("1"));
            System.out.println(obj.containsKey("y"));
            System.out.println(obj.keySet());
            System.out.println(obj.entrySet());
            System.out.println(obj.size());
	}

}
