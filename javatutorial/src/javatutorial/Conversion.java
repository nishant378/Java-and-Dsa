package javatutorial;
import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		int rupee,paisa;
		Scanner obj=new Scanner(System.in);
		System.out.println("Rupee:");
rupee=obj.nextInt();
paisa=100*rupee;
System.out.println("Paisa:"+paisa);
obj.close();
	}

}
