
import java.util.Scanner;
public class bebo {

	public static void main(String[] args) {
		char ch1='t';
		int temp1=0;
		Course[] obj1 = new Course[5]; 
		
		int temp2=0;
		Student[] obj2=new Student[5];
		
		int temp3=0;
		Result[] obj3=new Result[10];
		
		do 
		{
		System.out.println("Main menu- please select an option:");
		System.out.println("1.Add a course");
		System.out.println("2.Add a student");
		System.out.println("3.Add a result");
		System.out.println("4.View results");
		System.out.println("5.Quit");
		
		
		
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter your option:");
	    int option = myObj.nextInt();  
	    
	    char ch='A';
	    
	    char flag='t';
	    char flag1='t';
	    char flag3='t';
	    switch(option){  
	    
	    case 1: 
	    while(ch=='A' || ch=='a') 
	    {
	    	if(temp1<5)
	    	{
	    	     System.out.println("Please enter course code:");
	    	     String courseCode=myObj.nextLine();
	    	     courseCode=myObj.nextLine();
	    	     System.out.println("Please enter course name:");
	    	     String courseName=myObj.nextLine();
	    	
	    	      obj1[temp1]=new Course(courseCode,courseName);
	    	      temp1++;
	    	      while(true)
	    	      {
	    	          System.out.println("Would you like to [A]dd a new course or [R]eturn to the previous menu:");
	    	          ch=myObj.next().charAt(0);
	    	          if(ch=='a' || ch=='A' || ch=='R' || ch=='r')
	    	          {
	    	        	  break;
	    	          }
	    	          else 
	    	          {
	    	        	  System.out.println("Invalid Input Try Again");
	    	          }
	    	     }
	    	}
	    	else 
	    	{
	    		System.out.println("sorry course storage is full");
	    		ch='r';//for break
	    	}
	    	
	    }
	        break;  
	    case 2: 
	    	ch='A';
	    	while(ch=='A' || ch=='a') 
		    {
	    	 	if(temp2<5)
		    	{
	    	      System.out.println("Please enter student ID:");
	    	      String studentId=myObj.nextLine();
	    	      studentId=myObj.nextLine();
	    	      System.out.println("Please enter student Name:");
	    	      String studentName=myObj.nextLine();
	   
	    		  obj2[temp2]=new Student(studentId,studentName);
	    		  temp2++;
	    		  while(true)
		    	  {
		    	    System.out.println("Would you like to [A]dd a new student or [R]eturn to the previous menu:");
		    	    ch=myObj.next().charAt(0);
		    	    if(ch=='a' || ch=='A' || ch=='R' || ch=='r')
		    	    {
		    	        break;
		    	    }
		    	    else 
		    	    {
		    	        System.out.println("Invalid Input try again");
		    	    }
		    	  }
	    	}
	    	else
	    	{
	    		System.out.println("Can't have more student");
	    		ch='r';//for break the loop
	    	}
		  }
	        break;  
	    case 3: 
	    	if(temp3!=10)
	    	{
	    	flag='t';
	    	while(flag=='t')
	    	{
	    	   System.out.println("Please enter studentId:");
	    	   String sId=myObj.nextLine();    
	    	
	    	      sId=myObj.nextLine();
	    	     
	    	   
	    	   for(int i=0;i<temp2;i++)
	    	   {
	    		  if(sId.equals(obj2[i].studentId))
	    		  {
	    			 obj3[temp3]=new Result();
	    			 obj3[temp3].f3(sId);
	    			 flag='f';
	    			 break;
	    		  }
	    		  else if(i==temp2-1)
	    		  {
	    			   System.out.println("Student doesn't exist");  
	    		  }
	    	   }
	    	}
	    	
	    	flag='t';
	    	while(flag=='t')
	    	{
	    	   System.out.println("Please enter courseCode:");
	    	   String CC=myObj.nextLine();
	    	   for(int i=0;i<temp1;i++)
	    	   {
	    		   if(CC.equals(obj1[i].courseCode))
	    		   {
	    			   obj3[temp3].f2(CC);
	    			   flag='f';
	    			   break;
	    		   }
	    		   else if(i==temp1-1)
	    		   {
	    			  System.out.println("Course doesn't exist");
	    		   }
	    	   }
	    	}
	    	
	        flag='t';
	        while(flag=='t')
	        {
	    	    System.out.println("Please enter final score");
	    	    double finalResult=myObj.nextDouble();
	    	    if(finalResult<=100 && finalResult>=0)
	    	    {
	    	    	obj3[temp3].f1(finalResult);
	    	    	flag='f';
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("Score is not between 0.0 and 100.0 inclusive");
	    	    }
	        }
	        temp3++;
	    }
	    	else
	    	{
	    		System.out.println("Result storage is full");
	    	}
	    break;  
	    
	    case 4: 
	    	flag1='t';
	    	
	    	while(flag1=='t')
	    	{
	    		flag3='t';
	    	System.out.println("Would you like to view [C]ourse results , [S]tudent results or [R]eturn");
	    	char input=myObj.next().charAt(0);
	    	if(input=='C' || input=='c')
	    	{
	    		System.out.println("Please enter course code");
	    		String CC=myObj.nextLine();
	    		CC=myObj.nextLine();
	    		String s="";
	    		for(int i=0;i<temp3;i++)
		    	{
		    		if(CC.equals(obj3[i].courseCode))
		    		{
		    			System.out.println("Result for course:"+obj3[i].courseCode);
		    		    for(int j=0;j<temp2;j++)
		    		    {
		    		    	if(obj3[i].studentId.equals(obj2[j].studentId))
		    		    	{
		    		    		s=obj2[j].studentName;
		    		    	}
		    		    }
		    			System.out.println(obj3[i].studentId+"---"+s+"---"+obj3[i].finalScore);
		    			flag3='f';
		    	    }
		    		else if(i==temp3-1 && flag3=='t')
		    		{
		    			System.out.println("Course doesn't exist");
		    		}
		    	}
	    	}
	    	else if(input=='S' || input=='s')
	    	{
	    		System.out.println("Please enter student id");
	    		String sId=myObj.nextLine();
	    		sId=myObj.nextLine();
	    		String str="";
	    		for(int i=0;i<temp3;i++)
		    	{
		    		if(sId.equals(obj3[i].studentId))
		    		{
		    			System.out.println("Result for student:"+obj3[i].studentId);
		    			for(int j=0;j<temp1;j++)
		    			{
		    				if(obj3[i].courseCode.equals(obj1[j].courseCode))
		    				{
		    					str=obj1[j].courseName;
		    				}
		    			}
		    			System.out.println(obj3[i].courseCode+"---"+str+"---"+obj3[i].finalScore);
		    			flag3='f';
		    	    }
		    		else if(i==temp3-1 && flag3=='t')
		    		{
		    			System.out.println("Student doesn't exist");
		    		}
		    	}
	    	}
	    	else if(input=='r' || input=='R')
	    	{
	    		flag1='f';
	    	}
	    	else 
	    	{
	    		System.out.println("Invalid Input Try Again!");
	    	}
	    	}
	    break;
	    case 5:
	    	System.out.println("Thanks for using this system! Good Bye.......");
	    	ch1='f';
	    	break;
	    //Default case statement  
	    default:
	    	System.out.println("Invalid Input Try again!");  
	    }  
	    
	    
	    
		
		
		
		
		}while(ch1=='t');
	}
	

}


class Course
{
	String courseCode;
	String courseName;
	
	Course(String courseCode, String courseName)
	{
		this.courseCode=courseCode;
		this.courseName=courseName;
	}
}

class Student
{
	String studentId;
	String studentName;
	
	Student(String studentId, String studentName)
	{
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
}
class Result
{
	double finalScore;
	String courseCode;
	String studentId;
	void f1(double finalScore)
	{
		this.finalScore=finalScore;
	}
	void f2(String courseCode)
	{
		this.courseCode=courseCode;
	}
	void f3(String studentId)
	{
		this.studentId=studentId;
	}
}



