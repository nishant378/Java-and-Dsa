package varargs;
class h
{
	void rare(int... a)
	{
		for(int i:a)
		{
		System.out.println("i:"+i);
		}
	}
}
public class Varar {

	public static void main(String[] args) {
	h obj=new h();
	obj.rare(6);
	obj.rare(4,8);
	}
}
//The biggest advantage of this argument is to remove method overloading.