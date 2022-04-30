package looping;
import java.util.Scanner;
public class Logics {

	public static void main(String[] args) {
		int c=0,n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a value:");
		n=obj.nextInt();
         for(int i=2;i<=n;i=i+c)
         {
        	 System.out.println(i);
        	 c=c+1;
         }
         obj.close();
	}
	

}
