package array;
import java.util.Scanner;
public class AdditionMatrix {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		System.out.println("Enter array");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{			
			     a[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter array again");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{				
			     b[i][j]=obj.nextInt();
			}
		}
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{			
			     c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("resulted array");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
			     System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		obj.close();
		

	}

}
