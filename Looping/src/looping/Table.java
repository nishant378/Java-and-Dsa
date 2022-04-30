package looping;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number:");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(int i=n;i<=n*10;i=i+n)
		{
			System.out.println(i);
		}
		obj.close();
	}
}
