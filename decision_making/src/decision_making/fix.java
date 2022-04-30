package decision_making;
import java.util.Scanner;
public class fix {

	public static void main(String[] args) {
		int a,b;
	Scanner obj=new Scanner(System.in);	
System.out.println("enter two number:");
a=obj.nextInt();
b=obj.nextInt();
if(a>b)
{
	a=a-b;
}
else
{
	a=b-a;
	
}
obj.close();
System.out.println("positive result:"+a);
	}

}
