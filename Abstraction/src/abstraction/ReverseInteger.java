package abstraction;

import java.util.*;


class Solution {
	int tempp;
    public int reverse(long x) {
    	tempp=0;
    if(x>=0)
    {
    	 tempp=1;
      int y= ReverseInteger(x);
        return y;
    }
    else 
    {
    	tempp=2;
    	x=(-1)*(x);
        int z=ReverseInteger(x);
        return z;
    }
   
 }
  
    

    
    public int ReverseInteger(long x)
    {
        @SuppressWarnings("deprecation")
		Long obj=new Long(x);
        String temp=obj.toString();
        int[] newGuess = new int[temp.length()];
        int flag=temp.length()-1;
        for (int i = 0; i < temp.length(); i++)
        {
          newGuess[flag] = ((int)temp.charAt(i))-48;
          flag--;
        } 
        String[] strArray = new String[newGuess.length];
 
        for (int i = 0; i < newGuess.length; i++) {
            strArray[i] = String.valueOf(newGuess[i]);
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < strArray.length; i++) {
           sb.append(strArray[i]);
        }
        String str = sb.toString();
       
        
        if(tempp==1)
        {
        if(Long.parseLong(str)<=2147483647)
        {
        	int i=Integer.parseInt(str); 
            return i;	
        }
        else
        {
            return 0;
        }
        }
        else 
        {
        	 if(-Long.parseLong(str)>=-2147483648)
             {
             	int i=-Integer.parseInt(str); 
                 return i;	
             }
             else
             {
                 return 0;
             }
        }
    }
    }
class ReverseInteger
{
    public static void main(String []args)
    {
    	 Solution obj=new Solution();
         @SuppressWarnings("resource")
		Scanner obj1=new Scanner(System.in);
        System.out.println("Enter any number:");
         long value=obj1.nextLong();
         System.out.println(obj.reverse(value));
    }
}
