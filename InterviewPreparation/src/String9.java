import java.util.*;
public class String9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first string:");
        String s1=obj.nextLine();
        
        System.out.println("Enter second string:");
        String s2=obj.nextLine();
        
           s1 =s1+s2;
        
       
        
        s2=s1.substring(0,(s1.length()-s2.length()));
        s1=s1.substring(s2.length(),s1.length());
        
        System.out.println("first string:"+s1);
        System.out.println("second string:"+s2);
	}

}
