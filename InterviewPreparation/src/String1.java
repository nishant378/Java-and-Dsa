import java.util.*;
public class String1 {

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
         System.out.println("Reverse string:"+rev);
	}

}
