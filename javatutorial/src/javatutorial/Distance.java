package javatutorial;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		int km,m;
		Scanner obj=new Scanner(System.in);
		System.out.println("kilometer:");
		km=obj.nextInt();
		m=1000*km;
		System.out.println("meter is:"+m);
		obj.close();
	}

}
