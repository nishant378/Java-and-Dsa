package looping;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value:");
         int n=obj.nextInt();
         for(int i=n;i<=n;i++)
         {
        	 System.out.println(i*i);
         }
         obj.close();
	}

}
