package decision_making;
import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number:");
         int a;
         a=obj.nextInt();
         if(a>=80)
         {
        	 System.out.println("S");
         }
         else if(a>=70)
         {
        	 System.out.println("A");
         }
         else if(a>=60)
         {
        	 System.out.println("B");
         }
         else if(a>=50)
         {
        	 System.out.println("C");
         }
         else if(a>=40)
         {
        	 System.out.println("D");
         }
         else if(a>=33)
         {
        	 System.out.println("E");
         }
         else 
         {
        	 System.out.println("Fail");
         }
         obj.close();
	}
}
