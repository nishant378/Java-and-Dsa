package heap;

class MakingStack
{
	int top=0;
	int p;
	void push(int a[],int data)
	{
		if(top<a.length)
		{
	       a[top]=data;
	       if(top!=0)
			{
				adjust(a,top);
			}
	       top++;	    	   
	      
		}
		
	}
	
	void adjust(int a[],int i) 
	{
		   if(a[(i-1)/2]>a[i])
		   {
			   int temp=a[(i-1)/2];
			   a[(i-1)/2]=a[i];
			   a[i]=temp;
		   }
		   if(i!=0)
		   {
			   adjust(a,(i-1)/2);
		   }
	}
	
	void pop(int a[],int i)
	{
		p=a[0];
		if(i==0 && top-1!=-1)
		{
			a[0]=a[top-1];
			top--;
		}
		if(2*i+1<=top-1 && 2*i+2<=top-1)
		{
			if(a[2*i+1]>a[2*i+2])
			{
				if(a[2*i+2]<a[i])
				{
				int temp=a[2*i+2];
				a[2*i+2]=a[i];
				a[i]=temp;
				pop(a,2*i+2);
				}
			}
			else if(a[2*i+1]<a[2*i+2])
			{
				if(a[2*i+1]<a[i])
				{
				int temp=a[2*i+1];
				a[2*i+1]=a[i];
				a[i]=temp;
				pop(a,2*i+1);
				}
			}
		}
		else if(2*i+1<=top-1)
		{
			if(a[2*i+1]<a[i])
			{
				int temp=a[2*i+1];
				a[2*i+1]=a[i];
				a[i]=temp;
			}
		}
	}
	
	int gettop()
	{
		return p;
	}
}
public class Problem2 {

	public static void main(String[] args) {
		MakingStack obj=new MakingStack();
		int a[]= new int[7];
		obj.push(a,10);
		obj.push(a,4);
		obj.push(a,9);
		obj.push(a,8);
		obj.push(a,6);
		obj.push(a,5);
		obj.push(a,3);
		obj.pop(a,0);
         obj.pop(a,0);
		System.out.println(obj.gettop());
      System.out.println("top:"+obj.top);
      
      for(int i=0;i<obj.top;i++)
      {
    	  System.out.println("a[i]:"+a[i]);
      }
	}

}
