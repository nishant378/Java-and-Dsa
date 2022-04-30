import java.util.Scanner;
public class String5 {

	public static void main(String[] args) {
	 @SuppressWarnings("resource")
	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter a string:");
	 String s=obj.nextLine();
	 
	 String words[]=s.split("\\s");
	 String str="";
	 for(String w:words) {
		 String rev="";
		 String s1=w.toUpperCase();
		 char ch[]=s1.toCharArray();
		 for(int i=ch.length-1;i>=0;i--)
		 {
			 rev=rev+ch[i];
		 }
		 String first=rev.substring(0,1);
		 String afterfirst=rev.substring(1);
		 str=str+first.toLowerCase()+afterfirst+" ";
	 }
	 System.out.println(str);
	 
	 
	 
	}

}
