package collectionClass;
import java.util.*;
public class CollectionClass1 {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(9);
		obj.add(6);
		obj.add(2);
		System.out.println(obj);
		System.out.println(Collections.binarySearch(obj,6));//It give -2 because binarySearch is apply on sorting list
		Collections.sort(obj);
		System.out.println(Collections.binarySearch(obj,6));//After Sorting
           System.out.println(obj);
           Collections.reverse(obj);
           System.out.println(obj);
           Collections.shuffle(obj);
           System.out.println(obj);
           Collections.swap(obj, 1,2);
	}

}
