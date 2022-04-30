package switchs;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int choice,a,b,c;
		System.out.println("1.ADD\n 2.SUB\n 3.MUL\n 4.DIVIDE\n ");
		
		System.out.println("Enter your choice:");
        choice=obj.nextInt();
        switch(choice)
        {
        case 1:
        	{
        		System.out.println("Enter two value:");
        		a=obj.nextInt();
        		b=obj.nextInt();
        		c=a+b;
        		System.out.println("Result:" + c );
        		break;
        	}
        case 2:
        	
        	{
        		System.out.println("Enter two value:");
        		a=obj.nextInt();
        		b=obj.nextInt();
        		c=a-b;
        		System.out.println("Result:" + c );
        		break;
        	}
        case 3:
        	
        	{
        		System.out.println("Enter two value:");
        		a=obj.nextInt();
        		b=obj.nextInt();
        		c=a*b;
        		System.out.println("Result:" + c );
        		break;
        	}
        case 4:
        	
        	{
        		System.out.println("Enter two value:");
        		a=obj.nextInt();
        		b=obj.nextInt();
        		c=a/b;
        		System.out.println("Result:" + c );
        		break;
        	}
       
       default:
       {
       System.out.println("Wrong Choice");
       }
        	
 }
        obj.close();
        
	}

}
