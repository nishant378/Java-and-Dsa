package abstraction;
abstract class Animal
{
	String colour;
	abstract void speak();
	abstract void eat();
	abstract void jump();
	abstract void height();	
}
class Dog extends Animal
{
	void speak()
	{
		System.out.println("boww..");
	}
	void eat()
	{
		System.out.println("The dog eat something like biscuits*");
	}
	void jump()
	{
		System.out.println("Dog jump onto the bed");
	}
	void height()
	{
		System.out.println("height of dog is depend on the bread");
	}
}
class Cat extends Animal
{
	void speak()
	{
		System.out.println("Meow..");
	}
	void eat()
	{
		System.out.println("The Cat eat something like Yummy*");
	}
	void jump()
	{
		System.out.println("Cat jump onto the Rat");
	}
	void height()
	{
		System.out.println("height of cat is generally small");
	}
	void getcolour()
	{
		super.colour="Yellow";
		System.out.println(super.colour);
	}
}

public class AbstractClass1 {

	public static void main(String[] args) {
		System.out.println("*********Cat*********");
		Cat obj=new Cat();
		obj.eat();
		obj.getcolour();
		obj.jump();
		obj.height();
		obj.speak();
		System.out.println("*******Dog********");
		Dog obj1=new Dog();
		obj1.eat();
		obj1.height();
		obj1.jump();
		obj1.speak();
   
	}

}
