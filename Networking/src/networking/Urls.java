package networking;
import java.io.*;
import java.net.*;
public class Urls {

	public static void main(String[] args) {
		try
		{
	         URL obj=new URL("http://www.javatpoint.com:3/java-tutorial");
	          System.out.println(obj.getProtocol());
	          System.out.println(obj.getHost());
	          System.out.println(obj.getPort());
	          System.out.println(obj.getFile());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
