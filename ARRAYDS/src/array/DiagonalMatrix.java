package array;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
		
		int a[][]=new int[3][3];
		System.out.println("Enter array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{			
			     a[i][j]=obj.nextInt();
			}
		}
		
		int temp=a.length;
		for(int i=0;i<a.length;i++)           //[0 0 1]
		{                                     //[0 1 0]
			temp--;                           //[1 0 0]
			for(int j=a.length-1;j>=0;j--)
			{
				if(temp!=j && a[i][j]!=0)//If the matrix is diagonal matrix it'll print nothing, if not then it'll print false
				{
					System.out.println("false");
				}
			
			}
		}
			
	
		obj.close();

	}

}
