package objects;
class Check
{
	static int a=10;
}
public class Static {
                 
	public static void main(String[] args) {
		Check obj=new Check();
	System.out.println(obj.a);
		System.out.println("a="+Check.a);

	}

}
