package networking;
import java.io.*;
import java.net.*;
public class ServerSockets1 {

	public static void main(String[] args) {
         try
         {
        	 ServerSocket ss=new ServerSocket(37712);
        	 Socket s=ss.accept();
        	 DataInputStream dis=new DataInputStream(s.getInputStream());
        	 String str=(String)dis.readUTF();
        	 System.out.println("message:"+str);
        	 ss.close();
        	 
        		 
         }
         catch(IOException e)
         {
        	 System.out.println(e.getMessage());
         }

	}

}
