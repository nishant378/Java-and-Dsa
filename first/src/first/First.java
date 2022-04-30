package first;

import java.util.Scanner;

public class First {
	
	
  static  void add()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.nextLine();
	     b=name.toLowerCase();
		switch(b)
		{
		
		case"yes":
		{
			
			System.out.println("hello java0");
			break;
			
		}
		case"no":
		{
			
			System.out.println("hello ");
			break;
			
		}
		default:
		{
			System.out.println("no ye nbsjsh");
		}
		
		}
	}

  
  public static void main(String[] args)
  {
	  add();
	  
  }
}
