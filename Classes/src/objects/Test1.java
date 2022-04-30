package objects;
class Dog
{
	int size;
	String breed ;
	String name;
	void bark()
	{
		System.out.println("Ruff! Ruff!");
	}
}
public class Test1 {

	public static void main(String[] args) {
	Dog d=new Dog();
	d.size=28;
    d.bark();
    d.size=23;
    d.bark();
    System.out.println(d.size);
	}

}
