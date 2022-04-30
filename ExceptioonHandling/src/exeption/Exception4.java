package exeption;
import java.io.*;
//our throw our catch
public class Exception4 {


	public static void main(String[] args) {
		
		try
        {
        throw new IOException();
        }
		catch(IOException e)
		{
			System.out.println("Exception:"+e.getMessage());
		}
		 System.out.println("After error...");
	}
//ya toh hmme try catch laga kar handle krna h, ya throws laga kar java ko batana h ki tum handle karo 
//hamare try catch se hi program aage chalega ,throws lagane se bhi nahi chalega aage.
	//throws laga kar sirf hum compile time pr hi exception handle kr sakte h
}
