package file;
import java.io.*;
public class Fh2 {

	public static void main(String[] args) throws IOException{ 
		
		
		FileOutputStream obj=new FileOutputStream("e:/music/hello.txt",true);
		String s="Tata Google";
	     char a[]=s.toCharArray();
	     for(int i=0;i<s.length();i++)
	    	obj.write(a[i]);
	    	obj.close();
	}

}
