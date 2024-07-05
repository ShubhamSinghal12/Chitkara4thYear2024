package Lec3;

public class MAximumCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubarraySumCircular(int[] nums) {
		int maxK = kadanesMax(nums);
		if(maxK < 0)
			return maxK;
		else
			return Math.max(maxK, circularSum(nums));
	}
	
	public int kadanesMax(int[] arr)
	{
		int sum = 0;
		int maxs = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			maxs = Math.max(maxs, sum);
			sum = Math.max(sum, 0);
		} 
		return maxs;
	}
	
	
	public int circularSum(int[] arr)
	{
		int sum = 0;
		int mins = arr[0];
		int ts = 0;
		for(int i = 0; i < arr.length; i++)
		{
			ts += arr[i];
			
			sum += arr[i];
			mins = Math.min(mins, sum);
			sum = Math.min(sum, 0);
		}
		return ts-mins;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
