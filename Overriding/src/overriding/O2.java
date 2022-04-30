package overriding;
class Animal
{
	void f1()
	{
		System.out.println("f1P");
	}
	void f2()
	{
		System.out.println("f2P");
	}
}
class Dog extends Animal
{
    void f1()
    {
    	System.out.println("f1C");
    }
	void f2()
	{
		System.out.println("f2C");
	}
}
public class O2 {

	public static void main(String[] args) {
		Animal obj=new Dog();
		obj.f1();//late binding
		obj.f2();
		Animal obj1=new Animal();
		obj1.f1();
		Dog obj2=new Dog();
		obj2.f1();
	}
}
