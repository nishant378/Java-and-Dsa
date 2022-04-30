package looping;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=obj.nextInt();
		int r,s=0;
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(t==s)
		{
			System.out.println("Palindrome number!!");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
		obj.close();
	}

}
