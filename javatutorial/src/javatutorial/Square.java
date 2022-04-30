package javatutorial;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number:");
		a=obj.nextInt();
		b=a*a;
		System.out.println("square is:"+b);
		obj.close();
	}

}
