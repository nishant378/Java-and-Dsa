package abstraction;
abstract class Shape
{
    String colour;
	abstract double area();
	public abstract String toString();
	 void getarea(double i)
	 {
		 System.out.println(i);
	 }
}
class Circle extends Shape
{ 
	String colour;
	double area()
	{
		return 3.5;
	}
	public String toString()
	{
		return "Red";
	}
}
class Rectangle extends Shape
{
	String colour="19";
	double area()
	{
		return 27.8;
	}
	public String toString()
	{
		return "Orange!";
	}
	void superc()
	{
		super.getarea(7);
	}
}
public class AbstractClass {

	public static void main(String[] args) {
	Rectangle obj=new Rectangle();
	System.out.println(obj.area());
	System.out.println(obj.toString());
     Circle obj1=new Circle();
     System.out.println(obj1.area());
     System.out.println(obj1.toString());
     obj.superc();   
     

	}       
}                                                                                                                                                                  
     
	


