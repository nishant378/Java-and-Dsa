package setters;
class Dogs
{
	int size;
	String name;
	void bark()
	{
		if(size>60)
		{
			System.out.println("Wooof! Wooof! ");
		}
		else if(size>14)
		{
			System.out.println("Ruff! Ruff!");
		}
		else
		{
			System.out.println("yip! yip!");
		}
	}
}
public class Dog {
	public static void main(String[] args) {
		Dogs d=new Dogs();
		d.size=70;
		d.bark();
		d.size=8;
		d.bark();
		d.size=15;
		d.bark();
	}

}
