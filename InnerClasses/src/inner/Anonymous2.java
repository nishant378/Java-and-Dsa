package inner;
class Hello
{
	int x=10;
	public void x()
	{
		System.out.println(x);
	}
}
class hi
{
	Hello h=new Hello()
	   {
		int y=3;
		public void x()
		{
			System.out.println(y);
		}
			};
}
public class Anonymous2 {

	public static void main(String[] args) {
		hi obj=new hi();
		obj.h.x();
	}

}
