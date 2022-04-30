import java.util.*;
public class Array2 {

	public static void main(String[] args) {
	        int a[]= {3,2,4,5,6};
	        
	        System.out.println("Given array:");
	        for(int i=0;i<a.length;i++)
	        {
	        	System.out.println(a[i]);
	        }
	        @SuppressWarnings("resource")
			Scanner obj=new Scanner(System.in);
	       
	        System.out.println("Enter the element which you want to delete:");
	        int num=obj.nextInt();
	        int position=-1;
	        for(int i=0;i<a.length;i++)
	        {
	        	if(a[i]==num)
	        	{
	        		position=i;
	        	}
	        }
	        if(position==-1)
	        {
	        	System.out.println("there is no such element");
	        }
	        else
	        {
	        	for(int i=position;i<a.length-1;i++)
	        	{
	        		a[i]=a[i+1];
	        	}
	        }
	        
	        System.out.println("Your changed array is:");
	        for(int i=0;i<a.length-1;i++)
	        {
	        	System.out.println(a[i]);
	        }
	        
	        
	        

	}

}
