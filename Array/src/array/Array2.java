package array;
class Cat
{
	int a=144*2;
	Cat(int a)
	{
		System.out.println("Cat  using our feet to jump!");
		System.out.println(a);
	}
	void Jump()
	{
		System.out.println("Cat is generate kinectic energy!");
	}
}
public class Array2 {

	public static void main(String[] args) {
		int a[]=new int[3];
		a[0]=10;
		System.out.println(a[0]);
		Cat c[]=new Cat[3];//declare complete array as object & also  declare a array variable of Student type(Non-primitive type) 
		c[0]=new Cat(1);//Constructor called
	
		
		c[0].Jump();
		System.out.println(c[0].a);
	}
//The array is not always declared dynamically!
//The array behave like an object!
//If we acess the data in the class(instance variable and function) we use one or more array as object to acess the data in the class!
//Or If we acess the data of constructor we use constructor called!
}
