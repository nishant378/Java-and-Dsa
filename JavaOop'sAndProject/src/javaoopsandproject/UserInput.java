package javaoopsandproject;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=obj.nextInt();
		System.out.println(a+2);

	}

}
