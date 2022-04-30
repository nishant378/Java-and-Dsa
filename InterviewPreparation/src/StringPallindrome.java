
import java.util.*;
public class StringPallindrome {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=obj.nextLine();
		
	    char ch[]=s.toCharArray();
	    String rev="";
	    
	    for(int i=ch.length-1;i>=0;i--)
	    {
	    	rev=rev+ch[i];
	    }
	    System.out.println(rev);
	    if(rev.equals(s))
	    {
	    	System.out.println("Palindrome string");
	    }
	    else
	    {
	    	System.out.println("Not a Palindrome string");
	    }
	    

	}

}
