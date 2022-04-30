package inheritance;
class Hero
{
	Hero()
	{
		System.out.println("this is parent class");
	}
}
class Zero extends Hero
{
	Zero()
	{
		super();
		System.out.println("this is child class");
	}
	void s()
	{
		System.out.println("sis");
	}
}
public class SuperC {

	public static void main(String[] args) {
		Zero obj=new Zero();
		obj.s();

	}

}
