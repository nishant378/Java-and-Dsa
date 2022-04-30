package arrays;
import java.util.Scanner;
public class Multiarray {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int b[][];
		b=new int[2][2];
		int a[][];
		a=new int[2][2];
		int c[][];
		c=new int[2][2];
		System.out.println("Enter MultiArray Ist list:");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				int value=obj.nextInt();
				a[i][j]=value;
			}
		}
		System.out.println("Enter MultiArray IInd list:");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				int value=obj.nextInt();
				b[i][j]=value;
			}
		}
		System.out.println("Addition of MD matrix:");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
		  obj.close();
	}

}
