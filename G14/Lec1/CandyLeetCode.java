package Lec1;

public class CandyLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	    public int candy(int[] arr) {
	        int[] lmd = new int[arr.length];
	        int[] rmd = new int[arr.length];
	        int ans = 0;

	        lmd[0] = 1;
	        for(int i = 1; i < arr.length; i++)
	        {
	            if(arr[i] > arr[i-1])
	            {
	                lmd[i] = lmd[i-1]+1;
	            }
	            else
	            {
	                lmd[i] = 1;
	            }
	        }

	        rmd[arr.length-1] = 1;
	        for(int i = arr.length-2; i>=0; i--)
	        {
	            if(arr[i] > arr[i+1])
	            {
	                rmd[i] = rmd[i+1] + 1;
	            }
	            else
	            {
	                rmd[i] = 1;
	            }
	        }
	        for(int i = 0; i < arr.length; i++)
	        {
	            ans += Math.max(lmd[i],rmd[i]);
	        }
	        return ans;
	        
	    }

}
