package Lec18;

public class GenerateSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,15,25};
		int[] arr2 = {1,5,20,30};
		gsa(arr1, arr2, 0, 0, 1, "", Integer.MIN_VALUE);

	}
	
	public static void gsa(int[] arr1,int[] arr2,int i,int j,int turn,String ans,int lp)
	{
		if(turn == 1)
		{
			for(int k = i; k<arr1.length; k++)
			{
				if(arr1[k] > lp)
				{
					gsa(arr1, arr2, k+1, j, 2, ans+arr1[k]+" ", arr1[k]);
				}
			}
		}
		else
		{
			for(int k = j; k < arr2.length;k++)
			{
				if(arr2[k] > lp)
				{
					System.out.println(ans+arr2[k]);
					gsa(arr1, arr2, i, k+1, 1, ans+arr2[k]+" ", arr2[k]);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
