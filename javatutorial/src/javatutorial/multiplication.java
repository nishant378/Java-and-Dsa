package javatutorial;
import java.util.Scanner;
public class multiplication {

	public static void main(String[] args) {
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter two no:");
		a=obj.nextInt();
		b=obj.nextInt();
		c=a*b;
		System.out.println("multiplication is:"+c);
		obj.close();
	}

}
 