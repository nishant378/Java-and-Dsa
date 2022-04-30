package arraylist;
import java.util.*;
public class Linklist {

	public static void main(String[] args) {
      LinkedList<Integer> obj=new LinkedList<Integer>();
      LinkedList<Integer> obj1=new LinkedList<Integer>();
     
          obj.addFirst(1);
          obj.addLast(3);
          
          obj.remove(0);
          
          obj1.addFirst(6);
          obj1.addFirst(3);
         System.out.println(obj);
      
         System.out.println(obj1);
           obj.add(0,27);
           
           System.out.println(obj);
          System.out.println(obj.getFirst());
          System.out.println("getlast");
           System.out.println(obj.getLast());
           System.out.println(obj.removeFirst());
           System.out.println(obj);
           System.out.println(obj.removeLast());
           System.out.println(obj);
           obj.addAll(1,obj1);
           System.out.println(obj);
           System.out.println(obj.remove());
          
           System.out.println(obj.peek());
           System.out.println(obj);
	}

}
