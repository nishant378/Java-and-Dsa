package switchs;
import java.util.Scanner;
public class Switch1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a,b,c;
	System.out.println("1.Areaofsquare\n 2.Areaofrectangle\n 3.Areaoftriangle\n 4.Areaofcircle\n  ");
     System.out.println("Enter your choice:");
     int choice=obj.nextInt();
     switch(choice)
     {
     case 1:
     {
    	 System.out.println("Enter a value:");
    	 a=obj.nextInt();
         b=a*a;
         System.out.println("Result:"+b);
         break;
    	 }
     case 2:
     {
    	 System.out.println("Enter two value:");
    	 a=obj.nextInt();
    	 b=obj.nextInt();
         c=a*b;
         System.out.println("Result:"+c);
         break;
     }
     
     case 3:
     {
    	 System.out.println("Enter two value:");
    	 a=obj.nextInt();
    	 b=obj.nextInt();
        double d=0.5*a*b;
         System.out.println("Result:"+d);
         break;
          }
     case 4:
     {
    	 System.out.println("Enter two value:");
    	 a=obj.nextInt();
         double d=3.14*a*a;
         System.out.println("Result:"+d);
         break;
     }
     default:
     {
    	 System.out.println("Wrong Choice!!");
     }
     }
     obj.close();
}
}
