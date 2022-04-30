package stack;
import java.util.Scanner;
class R
{
	int top=-1;
	int stack[]=new int[10];
	
	void stackSorting(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(top==-1)
			{
				push(a[i]);
			}
			else if(top!=-1 && a[i]<stack[top])
			{
				push(a[i]);
			}
			
			else
			{
				push(a[i]);
				for(int j=top;j>0;j--)
				{
					if(stack[j]>stack[j-1])
					{
						int temp=stack[j];
						stack[j]=stack[j-1];
						stack[j-1]=temp;
					}
				}
			}
		}
	}
	
	
    void push(int data)
    {
    	if(top<stack.length)
    	{
    		stack[top+1]=data;
    		top++;
    	}
    }
}
public class Problem2 {

	public static void main(String[] args) {
		R obj=new R();
		int a[]=new int[6];
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj1.nextInt();
		}
		obj.stackSorting(a);
		for(int i=obj.top;i>=0;i--)
		{
			System.out.println(obj.stack[i]);
		}
           obj1.close();
	}

}
