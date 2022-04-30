package looping;
import java.util.Scanner;
public class Fabonnic {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=obj.nextInt();
		int a,b,c;
		a=0;
		b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=n;i=i+=c)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		obj.close();
	}

}
