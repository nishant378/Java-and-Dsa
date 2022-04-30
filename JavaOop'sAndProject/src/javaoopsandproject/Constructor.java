package javaoopsandproject;
class hello 
{
	hello()//default constructor 
	{
		System.out.println("hello world!");
	}
	hello(int x)//parameterized constructor 
	{
		System.out.println(x);
	}//overloading constructor 
}
public class Constructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		hello obj=new hello();
		@SuppressWarnings("unused")
		hello obj1=new hello(1);
        

	}

}
