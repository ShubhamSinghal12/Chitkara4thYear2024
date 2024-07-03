package Lec7;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public static int maxSum(int[] arr)
	{
		int sum = 0;
		int maxs = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			maxs = Math.max(maxs, sum);
			if(sum < 0)
				sum = 0;
		}
		return maxs;
	}

}
