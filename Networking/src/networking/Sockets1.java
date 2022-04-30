package networking;
import java.io.*;
import java.net.*;
public class Sockets1 {

	public static void main(String[] args) {
		try
		{
	          Socket s=new Socket("local",37712);
	          DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	          dout.writeUTF("Hello John");
	          dout.flush();
	          dout.close();
	          s.close();	           
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
