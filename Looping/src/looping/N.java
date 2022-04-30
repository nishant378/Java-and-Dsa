package looping;
import java.util.Scanner;
public class N {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);	
		
		System.out.println("Enter a value: ");
		int i;
         int n=obj.nextInt();
         for(i=1;i<=n;i++)
         {
        	 System.out.println(i);
         }
         obj.close();
	}

}
