package file;
import java.io.*;
public class Fh3 {

	public static void main(String[] args)throws IOException {
	FileInputStream obj=new FileInputStream("e:/music/hello.txt");
	int i=obj.read();
     do
     {
    	i=obj.read();
    	if(i!=-1)
    		System.out.println((char)i);
     }while(i!=-1);
	obj.close();
	}

}
