package array;

class Sum
{
	 public int[] twoSum(int[] nums, int target) {
		 int b[]=new int[2];
	       for(int i=0;i<nums.length;i++)
	       {
	    	   for(int j=i+1;j<nums.length;j++)
	    	   {
	    		   if(nums[i]+nums[j]==target)
	    		   {
	    			   b[0]=i;
	    			   b[1]=j;
	    			   break;
	    		   }
	    	   }
	       }
	       return b;
	    }
}
public class TwoSum {

	public static void main(String[] args) {
		Sum obj=new Sum();
	      int a[]= {2,7,11,15};
	       int c[]= obj.twoSum(a,9);
	       for(int i=0;i<c.length;i++)
	       {	   
	    	   System.out.println(c[i]);
	       }

	}

}
