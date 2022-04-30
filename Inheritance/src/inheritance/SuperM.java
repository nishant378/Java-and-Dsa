package inheritance;
class V
{
	void display()
	{
		System.out.println("this is vehicle class");
	}
}
class V1 extends V
{
	void display()
	{
		super.display();
		System.out.println("this is bike class");
	}
}
public class SuperM {

	public static void main(String[] args) {
		V1 obj=new V1();
		obj.display();
	}

}
