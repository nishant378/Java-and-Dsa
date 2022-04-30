package looping;
import java.util.Scanner;
public class ArmstrongNumber {

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
		    s=s+(r*r*r);
		}
		if(t==s)
				{
			     System.out.println("Armstrong number");
				}
		else
		{
			System.out.println("Not an Armstrong number");
		}
		obj.close();
	}

}
