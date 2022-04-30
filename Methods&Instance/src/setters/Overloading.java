package setters;
class Cat
{
	void speak()
	{
		System.out.println("Meow!!");
	}
	void speak(String s)
	{
		System.out.println(s);
	}
}
public class Overloading {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.speak();
		c.speak("Mow!!");

	}

}
