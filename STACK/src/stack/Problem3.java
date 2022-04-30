package stack;
class EqualStack
{
	int sum1=0;
	int sum2=0;
	int sum3=0;
	
	int temp1;
	int temp2;
	int temp3;
	
	   int a[] = {1,1,1,2,3};//you can try too 3,5,9
	     int b[]= {2,3,4};//you can try too 2,6,3
	     int c[]= {1,4,1,1};//you can try too 1,3,4
       
	     int top1=a.length-1;
         int top2=b.length-1;
         int top3=c.length-1;
       
       void sum()
       {
    	       for(int i=0;i<a.length;i++)
    	       {
    	    	   sum1= sum1 + a[i];
    	       }
    	       for(int i=0;i<b.length;i++)
    	       {
    	    	   sum2= sum2 + b[i];
    	       }
    	       for(int i=0;i<c.length;i++)
    	       {
    	    	   sum3= sum3 + c[i];
    	       }
       }
       
       int pop1()
       {
    	   if(top1!=-1)
    	   
    		   temp1=a[top1];
    		   top1--;
    	   
    	  return temp1;
       }
       
       int pop2()
       {
    	   if(top2!=-1)
    	   
    		   temp2=b[top2];
    		   top2--;
    	   
    	   return temp2;
       }
       
       int pop3()
       {
    	   if(top3!=-1)
    	   
    		   temp3=c[top3];
    		   top3--;
    	   
    	   return temp3;
       }
       
       void BalanceAt()
       {
    	   while(true)
    	   {
    		   if(sum1==sum2 && sum2==sum3)
    		   {
    			 int   height=sum1;
    			   System.out.println("Balance height at:"+height);
    			   break;
    		   }
    		   else if(sum1>=sum2 && sum1>=sum3)
    		   {
    			   sum1=sum1-pop1();
    		   }
    		   else if(sum2>=sum1 && sum2>=sum3)
    		   {
    			   sum2=sum2-pop2();
    		   }
    		   else if(sum3>=sum1 && sum3>=sum2)
    		   {
    			   sum3=sum3-pop3();
    		   }
    	   }
       }
}
public class Problem3 {

	public static void main(String[] args) {	
	       EqualStack obj=new EqualStack();
		  obj.sum();
		  obj.BalanceAt();
		  
		       
		        
		        
		        

	}

}
