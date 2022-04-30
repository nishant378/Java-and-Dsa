package javaoopsandproject;

class Solution {
    int sum=0;
    public int[] runningSum(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(i!=0)
            {
                nums[i]=sum;
            }
        }
        return nums;
    }
}
public class RunningArray {

	public static void main(String[] args) {
		 Solution obj=new Solution();
	        int a[]={3,1,2,10,1};
	        int b[]=obj.runningSum(a);
	        for(int i=0;i<b.length;i++)
	        {
	           System.out.println(b[i]);
	        }
	}

}

