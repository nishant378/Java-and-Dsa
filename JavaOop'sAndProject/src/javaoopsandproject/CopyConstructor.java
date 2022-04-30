package javaoopsandproject;
class Copy
{
	int x;
	Copy()
	{
		x=10;
	}
	Copy(Copy obj)
	{
		int y=obj.x;
		System.out.println(y);
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		Copy obj=new Copy();
		@SuppressWarnings("unused")
		Copy obj1=new Copy(obj);

	}

}
