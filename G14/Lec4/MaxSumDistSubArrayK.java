package Lec4;

import java.util.HashSet;

public class MaxSumDistSubArrayK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public long maximumSubarraySum(int[] nums, int k) {
        
		HashSet<Integer> hs = new HashSet<Integer>();
		long sum = 0;
		long ans = 0;
		int start = 0;
		for(int end = 0; end < nums.length;end++)
		{
			
			while(hs.contains(nums[end]) || hs.size() >= k)
			{
				sum -= nums[start];
				hs.remove(nums[start]);
				start++;
			}
			
			sum += nums[end];
			hs.add(nums[end]);
			
			if(hs.size() == k)
				ans = Math.max(ans, sum);
		}
		return ans;
		
    }

}
