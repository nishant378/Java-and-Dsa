package stack;
class RemoveDuplicate
{
	int top=-1;
	int flag=0;
	int stack[]=new int[5];
	void push(int data)
	{
	if(top==-1)
	{
		top++;
		stack[top]=data;
	}
	else
	{
		for(int i=top;i>=0;i--)
		{
			if(stack[i]==data)
			{
				flag=1;
			}
		}
		if(flag!=1)
		{
			if(top<stack.length-1)
			{
			top++;
			stack[top]=data;
			}
			else
			{
				System.out.println("stack is full");
			}
		}
		flag=0;
	}
	}
}
public class Problem4 {

	public static void main(String[] args) {
		RemoveDuplicate rb=new RemoveDuplicate();
		rb.push(5);
		rb.push(2);
		rb.push(5);
		rb.push(3);
		rb.push(4);
		rb.push(4);
		rb.push(1);
		rb.push(13);
		rb.push(15);
       for(int i=0;i<=rb.top;i++)
       {
    	   System.out.println(rb.stack[i]);
       }
       
	}

}
