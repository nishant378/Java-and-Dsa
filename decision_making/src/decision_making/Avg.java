package decision_making;
import java.util.Scanner;
public class Avg {

	public static void main(String[] args) {
		int p,c,m,e,h;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter physics marks:");
		p=obj.nextInt();
		System.out.println("enter chemistry marks:");
		c=obj.nextInt();
		System.out.println("enter math marks:");
		m=obj.nextInt();
		System.out.println("enter english marks:");
		e=obj.nextInt();
		System.out.println("enter hindi marks:");
		h=obj.nextInt();
		int avg;
		avg=(p+c+m+e+h)/5;
		if(avg>=80)
		{
			System.out.println("elligible");
		}
		else if(avg>=70 && m>=75)
		{
			System.out.println("elligible");
		}
		else if(avg>=60 && m+p>=75)
		{
			System.out.println("elligible");
		}
		else if(avg>=55 && m+p+c>=80)
		{
			System.out.println("elligible");
		}
		else
		{
			System.out.println("Not elligible");
		}
		 obj.close();
	}

}
