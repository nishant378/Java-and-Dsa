package javaoopsandproject;
class Animal
{
    void show()
	{
		System.out.println("Parent's class......");
	}
}
class Cat extends Animal
{
	public void show()
	{
		System.out.println("Child's class.....");
	}
}
public class Override {

	public static void main(String[] args) {
		Animal obj=new Animal();
		obj.show();//early binding
		Animal obj1=new Cat();//it's run according to the constructor 
		obj1.show();//late binding

	}

}
