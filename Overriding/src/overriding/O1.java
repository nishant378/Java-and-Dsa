package overriding;
class Parent
{
	void display()
	{
		System.out.println("Parent class...");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Child class...");
	}
}
public class O1 {

	public static void main(String[] args) {
		Parent obj=new Parent();
		obj.display();
	
		Parent obj1=new Child();//Run time Polymorphism or late binding*
		obj1.display();
	}

}
