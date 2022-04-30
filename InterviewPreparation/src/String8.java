
import java.util.*;
public class String8 {

	public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner obj=new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String s=obj.nextLine();
	        int count=0;
	        String str[]=s.split("\\s");
	        for(@SuppressWarnings("unused") String w: str)
	        {
	        	count++;
	        }
	        System.out.println(count);

	}

}
