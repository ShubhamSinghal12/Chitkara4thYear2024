package Lec4;

public class NumbersOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int numOfSubarrays(int[] arr, int k, int threshold) {
	        
		 int sum = 0;
		 int count = 0;
		 threshold *= k;
		 for(int i = 0;i < k; i++)
		 {
			 sum += arr[i];
		 }
		 if(sum >= threshold)
		 {
			 count++;
		 }
		 for(int i = k; i< arr.length;i++)
		 {
			 sum += arr[i]-arr[i-k];
			 if(sum >= threshold)
			 {
				 count++;
			 }
		 }
		 return count;
	    }

}
