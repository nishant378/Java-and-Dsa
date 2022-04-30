package generics;
class Animal<T>
{	
	void get(T i)
	{
		System.out.println(i);
	}
}
public class GenericsClass {

	public static void main(String[] args) {
	Animal<Integer> obj=new Animal<Integer>();//Parameter only contain Wrapper classes
	Animal<String> obj1=new Animal<String>();
	obj.get(3);
    obj1.get("Nice");
	}

}
