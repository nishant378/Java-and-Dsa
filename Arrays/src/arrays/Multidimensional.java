package arrays;
import java.util.Scanner;
public class Multidimensional {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		int a1[][]={{3,10,15},{10,45,12}};
		System.out.println(a1[1][1]);
		int b[][];
		b=new int[2][2];
		System.out.println("Enter MultiArray list:");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				int value=obj.nextInt();
				b[i][j]=value;
			}
		}
		System.out.println("The array is:");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.println(b[i][j]);
			}
		}
         obj.close();
	}

}
