package decision_making;
import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
	int number;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a  number:");
number =obj.nextInt();
if(number%2==0)
{
	System.out.println("Even");
}
else
{
	System.out.println("Odd");
}
obj.close();
	}

}
