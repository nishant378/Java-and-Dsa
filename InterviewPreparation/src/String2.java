import java.util.*;
public class String2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=obj.nextLine();
		
		String words[]=s.split("\\s");
		String capitalizeWord="";
		
		for(String w : words)
		{
			String first=w.substring(0,1);
			String afterfirst=w.substring(1);
			capitalizeWord=capitalizeWord+first.toUpperCase()+afterfirst+" ";
			
		}
           System.out.println(capitalizeWord);
	}

}
