package looping;
import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        System.out.println("Enter a value:");
        int n=obj.nextInt();
       int  c=1;
        for(int i=1;i<=n;i=i+c){
        System.out.println(i);
        c=c+2;
        }
        obj.close();
	}

}
