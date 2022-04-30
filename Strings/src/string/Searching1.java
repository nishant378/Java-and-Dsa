package string;

import java.util.Scanner;

public class Searching1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a[];
		a=new String [5];
		System.out.println("Enter String list:");
		for(int i=0;i<=4;i++)
		{
		a[i]=obj.nextLine();
		}
		System.out.println("Enter search element:");
		String search=obj.nextLine();
		for(int i=0;i<=4;i++)
		{
		if(a[i].equals(search))
		{
			System.out.println("found!!");
		}
		else
			System.out.println("Not found!!");
		}
		obj.close();

	}

}
