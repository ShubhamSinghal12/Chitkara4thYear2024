package Lec8;

public class MaxSumCircularSubArray1 {

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
		int maxs = nums[0];
		int sum = 0;
		for(int i = 0; i < nums.length; i++)
		{
			sum += nums[i];
			maxs = Math.max(maxs, sum);
			if(sum < 0)
				sum = 0;
		}
		return maxs;
	}
	
	public int minK_CircularSum(int[] nums)
	{
		int mins = nums[0];
		int sum = 0;
		int ts = 0;
		for(int i = 0; i < nums.length; i++)
		{
			ts += nums[i];
			
			sum += nums[i];
			mins = Math.min(sum, mins);
			if(sum > 0)
				sum = 0;
		}
		
		return ts-mins;
	}

}
