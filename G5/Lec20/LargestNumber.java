package Lec20;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {3,30,34,5,9};
//		sort(arr);
//		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String t1 = String.valueOf(o1);
				String t2 = String.valueOf(o2);
				
				return -1*(t1+t2).compareTo(t2+t1);
			}
		});
		System.out.println(Arrays.toString(arr));

	}
	
	public static void sort(int[] arr)
	{
		for(int i = 0 ; i < arr.length-1;i++)
		{
			for(int j = 0; j < arr.length-i-1; j++)
			{
				if(compare(arr[j],arr[j+1]) < 0)
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	}
	
	public static int compare(int a,int b)
	{
		String t1 = String.valueOf(a);
		String t2 = String.valueOf(b);
		
		return (t1+t2).compareTo(t2+t1);
	}

}
