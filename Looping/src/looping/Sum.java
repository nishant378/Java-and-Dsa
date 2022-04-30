package looping;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int n,s=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value:");
		n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			s=s+i;
			}
		System.out.println("Result is:"+s);
		obj.close();
	}

}
