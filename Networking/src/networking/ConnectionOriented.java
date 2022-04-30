package networking;
import java.io.*;
import java.net.*;
public class ConnectionOriented {

	public static void main(String[] args) {
		//If you send request to server socket then you have to write IP address and port number of that
		try{      
			Socket s=new Socket("localhost",6666);  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			dout.writeUTF("Hello Server");  
			dout.flush();  
			dout.close();  
			s.close();  
		
			}catch(Exception e){System.out.println(e);}  
			
		
	}

}
