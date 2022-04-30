package javaoopsandproject;
//Run time Polymorphism
class As
{
	public void show()
	{
		System.out.println("In show A");
	}
}
class Bs extends As
{
	public void show()
	{
		System.out.println("In show B");
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		As obj=new As();
		obj.show();
		As obj1=new Bs();
		obj1.show();
		As a;
		a=obj;
		a.show();
		a=obj1;
		a.show();

	}

}
