package decision_making;
import java.util.Scanner;
public class Greatests {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three number:");
	a=obj.nextInt();
	b=obj.nextInt();
	c=obj.nextInt();
if(a>b && a>c)
{
	System.out.println("a is greater");
}
else if(b>c && b>a)
{
	System.out.println("b is greater");
}
else
{
	System.out.println("c is greater");
}
obj.close();
	}

}
