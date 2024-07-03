package Lec4;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr = {3,1,2,5,4};
		
		for(int i = 0; i < arr.length-1; i++)
		{
			int swap = 0;
			for(int j = arr.length-1; j > i; j--)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swap++;
				}
				
			}
			if(swap == 0)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
