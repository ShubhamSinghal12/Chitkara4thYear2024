package Lec19;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargeFactory2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int minMinutes(int[] arr,int k)
	{
		int time = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int ele:arr)
		{
			pq.add(ele);
		}
		
		while(!pq.isEmpty())
		{
			int mw = pq.remove();
			if(mw <= time)
			{
				return time;
			}
			else
			{
				mw = mw-k-time;
				pq.add(mw+1);
				time++;
			}
		}
		
		
		return time;
	}

}
