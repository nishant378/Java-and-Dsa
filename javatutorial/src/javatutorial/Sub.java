package javatutorial;
import java.util.Scanner;
public class Sub {
public static void main(String args[])
{
	int a,b,c;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter two no:");
	a=obj.nextInt();
	b=obj.nextInt();
	c=a-b;
	System.out.println("sub is:"+c);
	obj.close();
}
}
