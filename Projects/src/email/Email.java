package email;

import java.util.Scanner;

public class Email {
	
	private String firstname;
	private String lastname;
	private String password;
	private int defaultpassword=8;
	private String department;
	private int mailboxcapacity=100;
	private String alternateEmail;
	private String email;
	private String companySuffix="aeycompany.com";
		
	//Constructor to receive the firstname and lastname
	
	public Email(String firstname,String lastname)
	{
		this.firstname=firstname;
				this.lastname=lastname;
				//System.out.println("Email created:" + this.firstname + " "+ this.lastname );
				
				//Call a method asking for the department-return the department
				this.department=setdepartment();
				//System.out.println("Department:"+ this.department);
				
				//Call a method that return a random password
				this.password=randomPassword(defaultpassword);
				System.out.println("Your password is:"+this.password);
				
				email=firstname.toLowerCase() + "." + lastname.toLowerCase()  + "@" + department +"." +companySuffix;
				//System.out.println("Your email is:"+ email);
				
	}
	//Ask for the department
	private String setdepartment()
	{
		System.out.println("New worker :"+ firstname+"\nDeparment codes:\n 1.for sales \n2. for devlopment\n3. for accounting\n0. for none");
		System.out.println("Enter the department code:");
		Scanner in=new Scanner(System.in);
		int depChoice=in.nextInt();
		in.close();
		if(depChoice==1)
		{
			return "sales";
		}
		else if(depChoice ==2)
		{
			return "devlopment";
		}
		else if(depChoice==3)
		{
			return "accounting";
		}
		else 
		{
			return "";
		}
	
	}
	//Generate a random password
	private String randomPassword(int length)
	{
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[]password=new char[length];
        for(int i=0;i<length;i++)
        {
        	int rand=(int)(Math.random() * passwordSet.length());
        	password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
	}
	
	//set the mailbox capactiy
	
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxcapacity=capacity;
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
	}
	//change the password
	public void changePassword(String password)
	{
		this.password=password;
	}
	
	public int getMailboxCapacity()
	{
		return mailboxcapacity;
	}
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	    
	public String getPassword()
	{
		return password;
	}
	
	public String showInfo()
	{
		return "DISPLAY NAME:" + firstname + " " + lastname + " "+
				"\nCOMPANY EMAIL:" + email + " "+
				"\nMAILBOX CAPACITY:" + mailboxcapacity +"mb";
	}
}
