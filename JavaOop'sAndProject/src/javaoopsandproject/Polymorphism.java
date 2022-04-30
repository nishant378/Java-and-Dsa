package javaoopsandproject;
//compile time polymorphism
class Av
{
	public void show()
	{
		System.out.println("Hello");
	}
	public void show(int i)
	{
		System.out.println(i);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Av obj=new Av();
		obj.show();
		obj.show(3);

	}

}
