package Lec8;

public class MaxSumCircularSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubarraySumCircular(int[] nums) {
        int maxK = maxKadanes(nums);
        if(maxK < 0)
            return maxK;
        else
		    return Math.max(maxK,minK_CircularSum(nums));
    }
	
	public int maxKadanes(int[] nums)
	{
		int maxs = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < nums.length; i++)
		{
			sum += nums[i];
			maxs = Math.max(maxs, sum);
			sum = Math.max(sum, 0);
		}
		return maxs;
	}
	
	public int minK_CircularSum(int[] nums)
	{
		int mins = Integer.MAX_VALUE;
		int sum = 0;
		int ts = 0;
		for(int i = 0; i < nums.length; i++)
		{
			ts += nums[i];
			
			sum += nums[i];
			mins = Math.min(mins, sum);
			sum = Math.min(sum, 0);
		}
		return ts - mins;
	}

}
