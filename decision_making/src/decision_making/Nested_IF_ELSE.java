package decision_making;

import java.util.Scanner;

public class Nested_IF_ELSE {

	public static void main(String[] args) {
		int number;
		Scanner obj =new Scanner(System.in);
		System.out.println("enter a number:");
		number=obj.nextInt();
		if(number>=60)
		{
	System.out.println("Ist");
		}
		else if(number>=45)
		{
			System.out.println("IInd");
		}
		else if(number>=33){
			System.out.println("IIIrd");
		}
		else
		{
			System.out.println("FAIL");
		}
		obj.close();
	}

}
