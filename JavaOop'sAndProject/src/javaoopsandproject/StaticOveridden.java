package javaoopsandproject;

class Parent
{
	static void m1()
	{
		System.out.println("m1P");
	}
}
class Child extends Parent
{
	static void m1()
	{
		System.out.println("m1c");
	}
}
public class StaticOveridden {

	public static void main(String[] args) {
		
		Parent.m1();

	}

}
