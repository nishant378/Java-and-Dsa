package set;
import java.util.BitSet;
public class Constructor1 {

	public static void main(String[] args) {
		 BitSet obj=new BitSet();
        BitSet obj1=new BitSet(5);
      for(int i=0;i<=6;i++)
      {
    	  obj1.set(i);
      }
      obj.set(2);
       System.out.println(obj1); 
       System.out.println(obj);
       
	}
}
