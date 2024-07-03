package Lec5;

public class FirstBadVersion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isBadVersion(int m)
	{
		return true;
	}
	public static int fbv(int n)
	{
		int s = 1;
        int e = n;
        int ans = 0;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(isBadVersion(mid))
            {
                ans = mid;
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
        }   
        return ans;
	}

}
