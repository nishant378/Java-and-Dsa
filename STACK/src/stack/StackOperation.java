package stack;
import java.util.Scanner;
class Stack
{//In this code I've used stack(push,pop,isEmpty,peek) operations
	int top=0;
	int count=0;
	void push(int data,int a[])
	{
		if(top<a.length)
		{
			
		a[top]=data;
		System.out.println("pushed");
		top++;
		}
		else
		{
			System.out.println("Stack overflow:Stack's full");
		}
	}
	void pop(int a[])
	{
		if(top!=0)
		{
		a[top-1]=0;
		top--;
		System.out.println("poped");
		}
		else
		{
			System.out.println("stack underflow:stack's empty");
		}
	}	
	void peek(int a[])
	{
		if(top!=0)
		{
			System.out.println("Peek element:"+a[top-1]);
		}
		else
		{
			System.out.println("there is no element");
		}
	}
	
	void isEmpty(int a[])
	{
		if(top==0)
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("Non-empty");
		}
	}
	void count(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				count++;
			}
		}
		System.out.println("count:"+count);
	}
}
public class StackOperation {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		Stack stack=new Stack();
	     int a[]=new int[5];
	    
	        stack.push(2,a);
	        stack.pop(a);	    
	     
	      
	        stack.peek(a);
	        stack.isEmpty(a);
	     stack.push(3,a);
	     stack.push(3,a);
	     stack.push(3,a);
	       stack.pop(a);	
	       stack.pop(a);	
	       stack.pop(a);	
	       stack.pop(a);	
	       stack.pop(a);	
	       stack.pop(a);	
	       stack.pop(a);	
	     stack.push(3,a);
	     stack.push(3,a);
	     stack.push(3,a);
	     stack.push(3,a);
	     stack.push(33,a);
	     stack.push(3,a);
	     
	        stack.peek(a);
	        stack.isEmpty(a);
	        stack.count(a);
	     System.out.println("Your stack is:");
	     for(int i=0;i<a.length;i++)
	     {
	    	 System.out.println(a[i]);
	     }
	     
	     
	     
        obj.close();
	}

}
