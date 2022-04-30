package stack;
import java.util.Arrays;
class B
{

	char a[]=new char[1];
	int top=0;
	void StringToArray(String s)
	{		
		  a=s.toCharArray();
		      stack();	
		
	}
	void stack()
	{
		char stack []=new char[a.length];
		for(int i=0;i<a.length;i++)
		{
		if(top<stack.length)
		{
			stack[top]=a[i];
			top++;
		}
		}
		Reverse(stack,stack.length);
	}
	void Reverse(char stack[],int n)
	{
		   char[] c = new char[n]; 
	        int temp= n; 
	        for (int i = 0; i < n; i++) { 
	            c[temp - 1] = stack[i]; 
	            temp= temp - 1; 
	        } 
	     a=c;
		
	}
}
public class Problem1 {

	public static void main(String[] args) {
	      
           B obj=new B();
               String s="nishant";
          
               obj.StringToArray(s);
             
             System.out.print(Arrays.toString(obj.a));
          
   		   
           
	}

}
