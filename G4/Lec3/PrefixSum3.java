package Lec3;

import java.util.Arrays;

public class PrefixSum3 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] ps = psum(arr);
		System.out.println(Arrays.toString(ps));
		int l = 1;
		int r = 3;
		System.out.println(ps[r+1]-ps[l]);
		
	}
	
	public static int[] psum(int[] arr)
	{
		int ps[] = new int[arr.length+1];
//		ps[0] = 0;
		for(int i = 1; i < ps.length; i++)
		{
			ps[i] = ps[i-1]+arr[i-1];
		}
		return ps;
	}

}
