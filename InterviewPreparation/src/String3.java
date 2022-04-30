import java.util.*;
public class String3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=obj.nextLine();
		
		String words[]=s.split("\\s");
		
		String str="";
		
	
		for(String w: words)
		{
			  char ch[]=w.toCharArray();
	          String rev="";
	          for(int i=ch.length-1;i>=0;i--)
	          {
	        	  rev=rev+ch[i];
	          }
	          str=str+rev+" ";
		}
		
		System.out.println(str);
		

	}

}
