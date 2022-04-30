package decision_making;
import java.util.Scanner;
public class Negative_Positive {

	public static void main(String[] args) {
	int a;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number:");
	a=obj.nextInt();
	if(a>0)
	{
System.out.println("Positive");
	}
	else
	{
		System.out.println("Negative");
	}
	obj.close();
}
}
