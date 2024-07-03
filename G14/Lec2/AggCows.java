package Lec2;

public class AggCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stalls = {1,2,4,8,9};
		int nc = 3;
		int st = 1;
		int end = 9;
		int ans = 1;
		while(st <= end)
		{
			int mid = (st+end)/2;
			if(isValid(stalls, nc, mid))
			{
				st = mid+1;
				ans= mid;
			}
			else
			{
				end = mid-1;
			}
		}
		System.out.println(ans);

	}
	
	public static boolean isValid(int[] stalls,int nc,int sol)
	{
		int count =1;
		int lastP = 0;
		for(int i = 1; i < stalls.length;i++)
		{
			if(stalls[i]-stalls[lastP] >= sol)
			{
				count++;
				lastP = i;
			}
		}
		return count >= nc;
	}

}
