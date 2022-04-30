import java.util.*;
public class String7Duplicate {

	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String s=obj.nextLine();
	    
	    char ch1[]=s.toCharArray();
	    
	    
	    int temp=-1;
	    char ch2[]=new char[ch1.length];
	    
	    //duplicate value array
	    int temp1=-1;
	    char ch3[]=new char[ch1.length];
	    
	    int flag=0;
	    
	    
	    for(int i=0;i<ch1.length;i++)
	    {
	    	flag=0;
	    	if(temp==-1)//if it's empty
	    	{
	    		temp++;
	    		ch2[temp]=ch1[i];
	    	}
	    	else
	    	{
	    		for(int j=0;j<=temp;j++)
	    		{
	    			if(ch1[i]==ch2[j])
	    			{
	    				flag=1;
	    			}
	    		}
	    		if(flag==1)
	    		{
	    			temp1++;
	    			ch3[temp1]=ch1[i];
	    		}
	    		else if(flag==0)
	    		{
	    			temp++;
	    			ch2[temp]=ch1[i];
	    		}
	    	}
	    }
	   
	    
	    
	    
	    
	    
	    if(temp1!=-1)
	    {
	    System.out.println("The duplicate element:");
	    for(int i=0;i<=temp1;i++)
	    {
	    	System.out.println(ch3[i]);
	    }
	    }
	    else
	    {
	    	System.out.println("there is no duplicate value");
	    }

	}

}
