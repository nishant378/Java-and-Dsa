package stack;
class H
{
	int top=0;
	char stack[]=new char[5];
	void Push(char data)
	{
		if(top<stack.length)
		{
			stack[top]=data;
			top++;
		}
	}
	
	void Pop()
	{
		if(top!=-1)
		{
			stack[top-1]=0;
			top--;
		}
	}
	
	
	
	boolean isMatch(char character1, char character2)
	{
		if(character1=='(' && character2==')')
		{
			return true;
		}
		else if(character1=='{' && character2=='}')
		{
			return true;
		}
		else if(character1=='[' && character2==']')
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	void checkParenthesis(char a[]) {
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='(' || a[i]=='{' || a[i]=='[')
			{
				Push(a[i]);
			}
			else 
		
				if(top>0)
			    {
			   if( a[i]==')' || a[i]=='}' || a[i]==']')
			   {
				   if( isMatch(stack[top-1],a[i])==true)
				   {
						Pop(); 
				   }
				   else
				   {
					   System.out.println("false");
				   }
			   }
			}
			
			else
			{
			      System.out.println("false");
			}
		
		}
	}
	
	
	
}
public class Parenthesis {

	public static void main(String[] args) {
       H obj=new H();
       char a[]= {')','('};
	       obj.checkParenthesis(a);
	
		
		
	}

}
