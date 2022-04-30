package stack;

class DeleteConsecutive
{
	int top=-1;
	char stack[]=new char[5];
	void push(char data)
	{
		if(top==-1)
		{
			top++;
			stack[top]=data;
		}
		else if(stack[top]==data)
		{
			top--;
		}
		else if(top<stack.length-1)
		{
			top++;
			stack[top]=data;
		}
		else
		{
			System.out.println("Stack is full");
		}
	}
}
public class Problem5 {

	public static void main(String[] args) {
		DeleteConsecutive obj=new DeleteConsecutive();

		obj.push('t');
		obj.push('j');
		obj.push('j');
		obj.push('l');
		if(obj.top!=-1)
		{
			for(int i=0;i<=obj.top;i++)
			{
				System.out.println(obj.stack[i]);
			}
		}
		

	}

}
