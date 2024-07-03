package Lec4;

import java.util.Arrays;

public class BubbleSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,1,5,2,4};
		
		for(int i = 0; i < arr.length-1; i++)
		{
			int swap= 0;
			for(int j = arr.length-1;j >= 1+i;j--)
			{
				if(arr[j] < arr[j-1])
				{
					int t = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = t;
					swap++;
				}
			}
			if(swap == 0)
				break;
			System.out.println(Arrays.toString(arr));
		}
	}
}
