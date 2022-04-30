import java.util.*;
public class String6 {

	public static void main(String[] args)
	{
          
		 @SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
          System.out.println("Enter a string:");
          String s=obj.nextLine();
          
          int result=Integer.parseInt(s);
          System.out.println(result);
          
          
          System.out.println("Enter a integer value:");
		  int n=obj.nextInt();
		  
		  String s1=Integer.toString(n);
		  
		  System.out.println(s1);
		
	}

}
