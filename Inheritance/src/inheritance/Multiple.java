package inheritance;
class Animal
{
	String name;
	String colour;
	void action()
	{
		System.out.println("Running!");
	}
}
    class Dog extends Animal
    {
    	void setname(String n)
    	{
    		name=n;
    	}
    	void setcolour(String c)
    	{
    		colour=c;
    	}
    }
    class Cat extends Dog
    {
    	
    	void Jump()
    	{
    		System.out.println("Cat Jump on the table!");
    	}
    	void getcolour()
    	{
    		System.out.println(colour);
    	}
    }
public class Multiple {

	public static void main(String[] args) {
	Cat obj=new Cat();
		obj.setcolour("Red!");
		System.out.println(obj.colour);
		obj.action();
		obj.getcolour();
		obj.Jump();
	}

}
