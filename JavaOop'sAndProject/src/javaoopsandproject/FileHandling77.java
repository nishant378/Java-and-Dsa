package javaoopsandproject;

import java.io.*;
import java.util.Scanner;
public class FileHandling77 {
	File file1,file2;
	Scanner scan=new Scanner(System.in);
	void createFile() {
		try
		{
			file1=new File("/home/nishant/Music/Filehandling1.txt");
			file2=new File("/home/nishant/Music/Filehandling2.txt");
			if(file1.exists() || file2.exists())
			{
				System.out.println("\n File 1 and File 2 are already exists.");
			}
			else
			{
				file1.createNewFile();
				file2.createNewFile();
				System.out.println("\nFile 1 and 2 is sucessfully created");
			}
		}
		catch(Exception e)
		{
			System.out.println("\nError:"+e.getMessage());
		}
	}
	
	void writeFW()
	{
		try
		{
			FileWriter fw=new FileWriter("/home/nishant/Music/Filehandling1.txt");
			System.out.println("\nEnter string value:");
			String dataFW=scan.nextLine();
			String EnterdataFW=dataFW;
			fw.write(EnterdataFW);
			fw.close();
			System.out.println("successfully write data is :"+EnterdataFW);
		}
		catch(Exception e)
		{
			System.out.println("\nError:"+e.getMessage());
		}
	}
		
	void writeBW()
	{
		try
		{
			FileWriter fww=new FileWriter("/home/nishant/Music/Filehandling2.txt");
			BufferedWriter bww=new BufferedWriter(fww);
			System.out.println("\nEnter string value:");
			String dataBW=scan.nextLine();
			String EnterdataBW=dataBW;
			bww.write(EnterdataBW);
			bww.close();
			System.out.println("Successfully write data is:"+EnterdataBW);
		}
		catch(Exception e)
		{
			System.out.println("\nError:"+e.getMessage());
		}
	}
	
	void readFR()
	{
		try
		{
			file1=new File("/home/nishant/Music/Filehandling1.txt");
			if(file1.exists())
			{
				FileReader fr=new FileReader("/home/nishant/Music/Filehandling1.txt");
				System.out.println("\n************Reading file 1 data by using FileReader***************");
				int ch=fr.read();
				while(ch!=-1)
				{
					System.out.print((char)ch);
					ch=fr.read();
				}
			}
			else
			{
				System.out.println("\n File1 is not found");
			}
		}
		catch(Exception e)
		{
			System.out.println("\nError:"+e.getMessage());
		}
	}
	
	void readBR()
	{
		try
		{
			file1=new File("/home/nishant/Music/Filehandling2.txt");
			if(file2.exists())
			{
				FileReader frr=new FileReader("/home/nishant/Music/Filehandling2.txt");
				BufferedReader brr=new BufferedReader(frr);
				System.out.println("\n************Reading file 2 data by using FileReader***************");
				String readBR=brr.readLine();
				while(readBR!=null)
				{
					System.out.println(readBR);
					readBR=brr.readLine();
				}
			}
			else
			{
				System.out.println("\n File2 is not found");
			}
		}
		catch(Exception e)
		{
			System.out.println("\nError:"+e.getMessage());
		}
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("-------------Welcome to File Handling Application-----------------------");
		FileHandling77 obj=new FileHandling77();
		Scanner input=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("\n\n##############Main Menu:############\n 1.Create two Files.\n 2.Write in File 1 using FileWriter\n 3.Write in File 2 using BufferedWriter\n 4. Read from file1 using FileReader\n 5.Read from File 2 using BufferedReader\n 6.Exit\n#######################");
			System.out.println("Enter your choice:");
			choice=input.nextInt();
			switch(choice)
			{
			case 1: obj.createFile();
			           break;
			case 2: obj.writeFW();
			              break;
			case 3: obj.writeBW();
			             break;
			case 4:
				obj.readFR();
				break;
			case 5:
				obj.readBR();
				break;
			case 6:
				System.out.println("\n--------------File handling application closed------------------");
				break;
			default:
				System.out.println("\nWrong choice!");
			}
					
					
		}while(choice!=6);
		input.close();

	}

}
