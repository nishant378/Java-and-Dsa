package serilization;
import java.io.*;
class Demos implements Serializable
{
	String name="Nishant";
	int rollno=11;
}
public class Deserialization  {

	public static void main(String[] args){
		//Serialization
		Demos obj=new Demos();
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
		 //Deserialization
       try
       {
    	   FileInputStream obj1=new FileInputStream("E:/music/hello.txt");
    	 ObjectInputStream obj2=new  ObjectInputStream(obj1) ;
    	  obj=(Demos)obj2.readObject();
    	 
    	 System.out.println(obj.name);
       }
       catch(IOException e)
       {
    	   System.out.println(e.getMessage());
       }
       catch(ClassNotFoundException e1)
       {
    	   System.out.println(e1.getMessage());
       }
       catch(ClassCastException e2)
       {
    	   System.out.println(e2.getMessage());
       }
	}
}