package Lec1;

public class TwoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,5,7,9,11};
		int tar = 12;
		
		int l = 0;
		int r = arr.length-1;
		
		while(l<r)
		{
			if(arr[l]+arr[r] == tar)
			{
				System.out.println(arr[l]+" "+arr[r]);
				r--;
//				l++;
			}
			else if(arr[l]+arr[r] > tar) {
				r--;
			}
			else {
				l++;
			}
		}

	}

}
