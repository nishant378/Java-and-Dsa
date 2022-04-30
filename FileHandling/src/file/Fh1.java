package file;
import java.io.*;
public class Fh1 {

	public static void main(String[] args)  {
		
			try
			{
		File F1=new File("e:/Music/hello.txt");
		F1.createNewFile();
		System.out.println(F1.exists());
		System.out.println("File mein kuch toh likh(Size of file):"+F1.length());
		System.out.println(F1.getName());
		System.out.println(F1.canWrite());
		System.out.println(F1.canRead());
		System.out.println(F1.delete());
			}

			catch(IOException e)
			{
				System.out.println("Exception:"+e.getMessage());
			}
          
		File F2=new File("e:/music");
           
           System.out.println("Exists:"+F2.exists());
			
	}

}
