package javaoopsandproject;
class Dog 
{
	String name="Joy";
	void speak()
	{
		System.out.println("Bow!!");
	}
}
public class ArrayAsAnObject {

	public static void main(String[] args) {
		Dog obj[]=new Dog[3];
		obj[0]=new Dog();
        System.out.println(obj[0].name);
	}

}
