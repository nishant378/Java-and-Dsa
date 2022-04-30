
package decision_making;
import java.util.Scanner;
public class Voter {

	public static void main(String[] args) {
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter age of voter:");
		age=obj.nextInt();
		if(age>=18)
		{
System.out.println("Voter");
	}
		else
		{
			System.out.println("Not voter");
		}
		obj.close();
	}
}
