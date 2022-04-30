package looping;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	int n,f=1;
	System.out.println("Enter a value:");
	n=obj.nextInt();
	for(int i=1;i<=n;i++)
	{
		f=f*i;
	}
	System.out.println("Factorial is:"+f);
	obj.close();
	}
}
