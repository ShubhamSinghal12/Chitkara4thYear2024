package Lec8;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubArray(int[] arr) {
		int sum = 0;
		int maxs = Integer.MIN_VALUE;
		for(int i = 0;i < arr.length; i++)
		{
			sum += arr[i];
			maxs = Math.max(maxs, sum);
			sum = Math.max(sum, 0);
		}
		return maxs;
    }

}
