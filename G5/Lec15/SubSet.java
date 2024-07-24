package Lec15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> bigAns = new ArrayList<ArrayList<Integer>>();
		subSet(new int[] {25,4,7}, 0, new ArrayList<Integer>(),bigAns);
		
		
		Collections.sort(bigAns,new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				// TODO Auto-generated method stub
				int i = 0;
				int j = 0;
				while(i < o1.size() && j < o2.size())
				{
					if(o1.get(i) != o2.get(j))
					{
						return o1.get(i) - o2.get(j);
					}
					else
					{
						i++;
						j++;
					}
				}
				return o1.size()-o2.size();
			}
			
		});
		for(ArrayList<Integer> ans : bigAns)
		{
			System.out.println(ans);
		}

	}
	
	public static void subSet(int[] arr,int i,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> bigAns)
	{
		if(i == arr.length)
		{
			bigAns.add(new ArrayList<>(ans));
		}
		else
		{
			//Not Include
			subSet(arr, i+1, ans,bigAns);
			
			//Include
			ans.add(arr[i]);
			subSet(arr, i+1, ans,bigAns);
			ans.remove(ans.size()-1);
		}
	}

}
