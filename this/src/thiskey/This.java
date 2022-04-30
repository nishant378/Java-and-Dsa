package thiskey;
class Cat
{
	int a;//instance variable
	int b;//instance variable
	Cat(int a,int b)//local variable
	{
		this.a=a;//current instance
		this.b=b;//current instance
	}
	void getdata()
	{
		System.out.println("a="+a+";"+"b="+b);
	}
}
public class This {

	public static void main(String[] args) {
		Cat c=new Cat(5,10);
		c.getdata();
	}
//this is a reference variable that refers to current object.
}
