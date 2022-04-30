package javaoopsandproject;

class Test4
{
	void display()
	{
		this.show();
	}
	void show()
	{
		System.out.println("inside show function");
	}
}
public class This4 {

	public static void main(String[] args) {
		Test4 obj=new Test4();
		obj.display();

	}

}
