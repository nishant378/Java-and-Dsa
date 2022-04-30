import java.util.*;
public class String4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=obj.nextLine();
		
		String words[]=s.split("\\s");
		String str="";
		for(String w : words)
		{
			String s1=w.toUpperCase();
			String first=s1.substring(0,1);
			String afterfirst=s1.substring(1);
			str=str+first.toLowerCase()+afterfirst+" ";
		}
		System.out.println(str);

	}

}
