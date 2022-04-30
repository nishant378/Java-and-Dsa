package finalize;
class Y
{
	int a=10;
	protected void finalize()
	{
		a=10;
		System.out.println(a);
	}
}
public class Finalize1 {

	public static void main(String[] args) {
	Y obj=new Y();
	System.out.println(obj);
	obj=null;
	System.out.println(obj);
	System.gc();
	}

}
