package javatutorial;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
	int radius;
	double area;
Scanner obj=new Scanner(System.in);
System.out.println("enter radius:");
radius=obj.nextInt();
area=3.14*radius*radius;
System.out.println("area_of_circle:"+area);
obj.close();

	}

}
