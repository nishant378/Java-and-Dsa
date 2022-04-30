package looping;
import java.util.Scanner;
public class While1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value:");
         int n=obj.nextInt();
         for(int i=1;i<=n;i++)
         {
        	 System.out.println(i);
         }
         obj.close();
	}

}
