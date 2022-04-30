package file;
import java.io.*;
public class Fh5 {

	public static void main(String[] args)throws IOException {
		int ch;
		FileReader obj=new FileReader("e:/music/hi.txt");
		BufferedReader obj1=new BufferedReader(obj);
		while((ch=obj1.read())!=-1)
		{
			System.out.println((char)ch);
		}
		obj1.close();
	}

}
