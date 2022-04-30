package constructor;
class hellos
{
	int x;
	hellos()
	{
		 x=10;
	}
	hellos(hellos obj)
	{
		System.out.println("Copy constructor!!");
		x=obj.x;
		System.out.println(x);
	}
}
public class Copy {

	public static void main(String[] args) {
	hellos h=new hellos();
	hellos t=new hellos(h);
   
	}

}
