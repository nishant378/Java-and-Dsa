package looping;
import java.util.Scanner;
public class Logic {

	public static void main(String[] args) {
	int i;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number:");

	
	int n=obj.nextInt();
for(i=1;i<=n;i=i+2)
{
	System.out.println(i);
}
obj.close();
	}

}
