package Lec3;

public class MinSizeSubArraySumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int minSubArrayLen(int target, int[] nums) {
		 int sum = 0;
		 int start = 0;
		 int ans = nums.length+1;
		 for(int end = 0; end < nums.length; end++)
		 {
			 sum += nums[end];
			 while(sum >= target)
			 {
				 ans = Math.min(ans, end-start+1);
				 sum -= nums[start];
				 start++;
			 }
		 }
		 
		 return ans == nums.length+1 ? 0 : ans;
		 
		 
		 
	 }

}
