package Lec5;

public class LowerBound_UpperBound2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int firstPosition(int[] nums,int target)
	{
		int start = 0;
		int end = nums.length-1;
		int ans = -1;
		while(start <= end)
		{
			int mid = (start+end)/2;
			if(nums[mid] == target)
			{
				ans = mid;
//				end = mid-1;
				start = mid+1;
			}
			else if(nums[mid] > target)
			{
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
		return ans;
	}

}
