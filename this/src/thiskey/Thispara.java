package thiskey;
class T
{
	int a;
	int b;
	T()
	{
		a=10;
		b=20;
	}
	
	void get()
	{
		display(this);
	}
	void display(T obj)
	{
		System.out.println("a="+obj.a+";"+"b="+obj.b);
			}
}
public class Thispara {

	public static void main(String[] args) {
		T t=new T();
		t.get();
	}

}
