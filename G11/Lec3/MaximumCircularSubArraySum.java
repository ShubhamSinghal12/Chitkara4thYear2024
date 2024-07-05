package Lec3;

public class MaximumCircularSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int maxSubarraySumCircular(int[] nums) {
		 
		 int maxK = maxKadanes(nums);
		 if(maxK < 0)
			 return maxK;
		 else
			 return Math.max(maxKadanes(nums), circularSum(nums));
		 
	    }
	 
	 public int maxKadanes(int[] arr)
	 {
		 int sum = 0;
		 int max = arr[0];
		 for(int i = 0; i< arr.length; i++)
		 {
			 sum += arr[i];
			 max = Math.max(max, sum);
			 sum = Math.max(sum, 0);
		 }
		 return max;
	 }
	 public int circularSum(int[] arr)
	 {
		 int sum = 0;
		 int ts = 0;
		 int min = arr[0];
		 for(int i = 0;i < arr.length; i++)
		 {
			 ts += arr[i];
			 
			 sum += arr[i];
			 min = Math.min(min, sum);
			 sum = Math.min(sum, 0);
		 }
		 return ts-min;
	 }

}
