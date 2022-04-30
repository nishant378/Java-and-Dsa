package looping;
import java.util.Scanner;
public class ImportantSeries {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a value:");
    int n=obj.nextInt();
    int a,b,c,d;
    a=0;
    b=1;
    c=2;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    for(int i=3;i<=n;i=i+d)
    {
    	d=a+b+c;
    	System.out.println(d);
    	a=b;
    	b=c;
    	c=d;
    }
    obj.close();
	}

}
