package stack;
class A
{
	int top=0;
	 int a[]=new int[1];
	 int count=0;
	void push(int data)
	{
		if(top<a.length)
		{
			a[top]=data;
			top++;
		}
		else
		{
			int temp[]=new int[a.length*2];
			for(int i=0;i<a.length;i++)
			{
				temp[i]=a[i];
			}
			a=temp;
			push(data);
		}
	}
	
	void pop()
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
	void peek()
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
	
	void isEmpty()
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
	
	void count()
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
public class DynamicStack {

	public static void main(String[] args) {
		A obj=new A();
		 
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
        obj.peek();
		obj.pop();
		obj.isEmpty();
		obj.peek();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		
		
		obj.push(1);
		obj.push(2);
		obj.push(3);
	
		obj.push(4);
		obj.push(1);
		 obj.peek();
		   obj.peek();
		obj.push(2);
		obj.push(3);
		obj.push(4);
		   obj.peek();
		  for(int i=0;i<10;i++)
		  {
			 obj.push(i);
		  }
		   obj.peek();
		   obj.count();
		System.out.println("Your stack is:");
	     for(int i=0;i<obj.a.length;i++)
	     {
	    	 System.out.println(obj.a[i]);
	     }
		

	}

}
