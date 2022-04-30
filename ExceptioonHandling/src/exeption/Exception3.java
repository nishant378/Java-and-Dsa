package exeption;
//our throw default catch
import java.io.*;
public class Exception3 {

	public static void main(String[] args) throws ArithmeticException {
		int balance=5000;
		int withdrawal=7000;
		System.out.println("Program start..");
		if(balance<withdrawal)
		{
			throw new ArithmeticException();
		
		
		}
		//throws laga kar sirf hum compile time pr hi exception handle kr sakte h
		
		}
	}
//darr mat ye java ka catch mechanism chala h

