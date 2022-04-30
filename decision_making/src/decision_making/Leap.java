package decision_making;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		int number;
		Scanner obj=new Scanner(System.in);
        System.out.println("enter a no.:");
        number=obj.nextInt();
        if(number%4==0)
        {
        	System.out.println("leap year");
        }
        else
        {
        	System.out.println("not leap year");
        }
        obj.close();
	}

}
