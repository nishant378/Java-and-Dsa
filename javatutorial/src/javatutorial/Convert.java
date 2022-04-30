package javatutorial;
import java.util.Scanner;
public class Convert {

	public static void main(String[] args) {
	int s,y;
	Scanner obj=new Scanner(System.in);
	System.out.println("Input:");
	y=obj.nextInt();
	s=365*24*60*60*y;
	System.out.println("result is:"+s);
	obj.close();
	}
}
