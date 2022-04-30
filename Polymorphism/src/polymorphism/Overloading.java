package polymorphism;
//Method overloading
class A
{
	void show()
	{
		System.out.println("Hi John,How're you?");
	}
	void show(String s)
	{
		s="John-I'm good";
		System.out.println(s);
	}
}
public class Overloading {

	public static void main(String[] args) {
		A obj=new A();
		obj.show();
		obj.show("hi Peter!");
	}
}
