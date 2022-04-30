package file;
import java.io.*;
public class Fh4 {

	public static void main(String[] args)throws IOException {
		FileWriter obj=new FileWriter("e:/music/hi.txt");
         BufferedWriter obj1=new BufferedWriter(obj);
         obj1.write("hello");
         obj1.close();
	}

}
