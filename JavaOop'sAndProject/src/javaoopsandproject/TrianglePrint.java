package javaoopsandproject;
import java.util.Scanner;
public class TrianglePrint {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of range of your triangle:");
		int input=obj.nextInt();
		int r=1;
		int flag=1;
		for(int i=1;i<=input;i++)
		{
			r=flag;
			while(r!=input)
			{
				System.out.print(" ");
				r++;
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			flag++;
		}

	}

}
