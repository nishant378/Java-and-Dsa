package looping;
import java.util.Scanner;
public class Series2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value:");
        int n=obj.nextInt();
        int c=0;
        for(int i=5;i<=n;i=i+c)
        {
        	System.out.println(i);
        	c=c+1;
        }
        obj.close();
	}

}
