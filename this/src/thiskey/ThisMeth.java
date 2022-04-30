package thiskey;
class I
{
	int a=10;
	int b=2;
	
	void hi()
	{
		this.he();
	}
	void he()
	{
		System.out.println("a="+a+"b="+b);
	}
}
public class ThisMeth {

	public static void main(String[] args) {
		I obj=new I();
		obj.hi();

	}

}
