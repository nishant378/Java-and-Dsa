package javaoopsandproject;
//We can achieve abstraction by interfaces and abstraction
//It's a program in which we used abstract class to achieve data abstraction
abstract class Animals
{
	String colour;
	abstract void eat();
	void getcolour(String c)
	{
		colour=c;
		System.out.println(colour);
	}
}
class Dogs extends Animals
{
	void eat()
	{
		System.out.println("Dog eat something");
		super.getcolour("Black like biscuits");
	}
}
public class Abstraction {

	public static void main(String[] args) {
	     Dogs obj=new Dogs();
	     obj.eat();

	}

}
