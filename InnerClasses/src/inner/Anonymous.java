package inner;
class India
{
public void sayHello()
{
	System.out.println("Hello");
}
}
class UK
{
	India obj=new India()
	{
		public void sayHello()
		{
			System.out.println("Kaminey!!");
		}
	};
}
public class Anonymous {

	public static void main(String[] args) {
		UK obj1=new UK();
		obj1.obj.sayHello();

	}

}

