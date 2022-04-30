package overriding;
class X
{
	static void show()
	{
		System.out.println("P");
	}
}
class Y extends X
{
	static  void show()
	{
		System.out.println("C");
	}
}
public class Static {

	public static void main(String[] args) {
		X obj=new Y();//static- this is because its shows early binding
		obj.show();//early binding
		X.show();
		Y.show();		
	}
}
