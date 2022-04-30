package decision_making;
import java.util.Scanner;
public class Choice {

	public static void main(String[] args) {
		int choice ;
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your choice:");
        choice=obj.nextInt();
        System.out.println("enter value of a:");
        a=obj.nextInt();
        System.out.println("enter value of b:");
        b=obj.nextInt();
        if(choice==1)
        {
        	c=a+b;
        	System.out.println("Result is:"+c);
        }
        else if(choice==2)
        {
        	c=a-b;
        	System.out.println("Result is:"+c);
        }
        else if(choice==3)
        {
        	c=a*b;
         	System.out.println("Result is:"+c);
        }
        else if(choice==4)
        {
        	c=a/b;
        	System.out.println("Result is:"+c);
        }
        else
        {
        	System.out.println("Wrong Choice!!");
        }
        obj.close();
	}

}
