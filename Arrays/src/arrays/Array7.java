package arrays;


class Dog
{
	int a[]=new int [5];
	
	void bark()
	{
		System.out.println("bow bow!!");
	}
}
public class Array7 {
	
	public static void main(String[] args) {
		
		Dog obj=new Dog();
		obj.a[0]=8;
System.out.println(obj.a[0]);
	}

}
