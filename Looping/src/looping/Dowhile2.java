package looping;
import java.util.Scanner;
public class Dowhile2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value:");
        int n=obj.nextInt();
        int i=1;
        do
        {
        	System.out.println(i);
        	i++;
        }while(i<=n);
        obj.close();
	}

}
