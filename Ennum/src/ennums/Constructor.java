package ennums;
enum Cat
{
	obj,u(100),o;//3 time constructor called
	Cat()
	{
		System.out.println("Meow!");
	}
	Cat(int o)
	{
		System.out.println(o);
	}
}
public class Constructor {

	public static void main(String[] args) {
		System.out.println(Cat.obj);
		System.out.println(Cat.u);
	}

}
