package hashtable;
import java.util.*;
public class HashTable {

	public static void main(String[] args) {
       Hashtable<Integer,String> obj=new Hashtable<Integer,String>();
       Hashtable<Integer,String> obj1=new Hashtable<Integer,String>();
 
            System.out.println(obj);
           
           
            System.out.println(obj.containsKey(obj1));
         
            System.out.println(obj.get(2));
            System.out.println(obj.isEmpty());
            System.out.println(obj.keys());
            System.out.println(obj.put(2,"Hello"));
            System.out.println(obj.isEmpty());
            System.out.println(obj.remove(obj1));
            System.out.println(obj.size());
            System.out.println(obj.toString());
	}

}
