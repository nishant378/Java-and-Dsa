package overriding;
class A
{
	final void show(){};
}
class B extends A
{
    //void show(){}
    
}
public class Final {

	public static void main(String[] args) {
		A obj=new B();
		obj.show();
	}

}
