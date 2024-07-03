package Lec3;

public class ArraysProductExceptSelf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static int[] apes(int[] nums)
	{
		int[] lp = new int[nums.length];
		int[] rp = new int[nums.length];
		int[] ans = new int[nums.length];
		
		int l = 1;
		for(int i = 0; i < nums.length; i++)
		{
			lp[i] = l;
			l = l*nums[i];
		}
		
		int r = 1;
		for(int i = nums.length-1; i>= 0; i--)
		{
			rp[i] = r;
			r = r*nums[i];
		}
		
		for(int i = 0; i < nums.length; i++)
		{
			ans[i] = lp[i]*rp[i];
		}
		return ans;
	}

}
