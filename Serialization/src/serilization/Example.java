package serilization;
import java.io.*;
class Cat implements Serializable
{
	int age;
	String name;
	void Jump()
	{
		System.out.println("Jump on the table");
	}
}
public class Example {

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.age=3;
		System.out.println(obj.age);
		try
		{
			ObjectOutputStream obj1=new ObjectOutputStream(new FileOutputStream("E:/music/hi.txt"));
			obj1.writeObject(obj);
			System.out.println("Sucess!");
			}
		
		catch(IOException i)
		{
			System.out.println(i.getMessage());
		}
		//deserialization
		try
		{
			ObjectInputStream obj2=new ObjectInputStream(new FileInputStream("E:/music/hi.txt"));
			obj=(Cat)obj2.readObject();
			obj.name="Thomas";
			System.out.println(obj.name);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
     
	}

}
