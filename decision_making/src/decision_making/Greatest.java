package decision_making;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter first number:");
		
		a=obj.nextInt();
		System.out.println("enter second number:");
		b=obj.nextInt();
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else 
		{
			System.out.println("b is greater");
		}
		obj.close();
	}

}
