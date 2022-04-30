package arraylist;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		//*****Collection Interface Method*******//
	ArrayList<Integer> obj=new ArrayList<Integer>();
	ArrayList<Integer> obj1 =new ArrayList<Integer>();
	
	obj.add(5);

	System.out.println(obj);
	obj1.add(2);
	obj1.add(9);
	System.out.println(obj1);
     
     obj.addAll(obj1);
     System.out.println(obj.contains(obj1));
     System.out.println(obj.size());
     System.out.println(obj);
     System.out.println(obj.remove(obj));
     System.out.println(obj.retainAll(obj1));
     obj.clear();
       System.out.println(obj);
     System.out.println(obj1.removeAll(obj));
     System.out.println(obj.isEmpty());
     System.out.println(obj.iterator());//access all the data from the array list
        //******List Interface Method*******//
     obj.add(0,3);
     System.out.println(obj);
     obj.set(0,2);
     obj.add(1,3);
     obj.add(2,2);
     System.out.println(obj);
     System.out.println(obj.get(0));
     System.out.println(obj.indexOf(2));
     System.out.println(obj.lastIndexOf(2));
     System.out.println(obj.remove(2));
     obj.add(2,4);
     obj.add(3,7);
     System.out.println(obj.subList(0,3));
  //New Capacity=(old capacity*3/2)+1;
	}

}
