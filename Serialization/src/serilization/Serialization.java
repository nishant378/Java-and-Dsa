package serilization;
import java.io.*;
class Demo implements Serializable
{
	String a;
	int b=2;
}
public class Serialization {

	public static void main(String[] args) {
         Demo obj=new Demo();
         obj.a="r";
         System.out.println(obj.a);
         try
         {
                  FileOutputStream obj1=new FileOutputStream("E:/Music/Hello.txt");
                  ObjectOutputStream obj2=new ObjectOutputStream(obj1);
                  obj2.writeObject(obj);
                  System.out.println("Sucess!");
                  obj2.close();
         }
         catch(IOException e)
         {
        	 System.out.println(e.getMessage());
         }
         
	}

}
