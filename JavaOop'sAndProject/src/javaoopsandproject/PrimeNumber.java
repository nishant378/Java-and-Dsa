package javaoopsandproject;

public class PrimeNumber {

	public static void main(String[] args) {
	    for(int i=1;i<=100;i++)//checking my number
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			if(i==j)
	    			{
	    		        System.out.println("Prime number:"+i);
	    			}
	    			else if(i!=j)
	    			{
	    				if(j!=1)
	    				{
	    				   break;
	    				}
	    			}
	    		}
	    	}
	    }
	}
}
