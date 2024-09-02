package Lec19;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargeFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
//		pq.add(1);
//		pq.add(10);
//		pq.add(3);
//		pq.add(20);
//		pq.add(40);
//		pq.add(25);
//		while(!pq.isEmpty())
//		{
//			System.out.println(pq.poll());
//		}

	}
	
	public static int minMinutes(int[] arr,int k)
	{
		int time = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int ele:arr)
			pq.add(ele);
		
		while(!pq.isEmpty())
		{
			int mw = pq.remove();
			if(mw-time <= 0)
				return time;
			else if(pq.isEmpty())
			{
				return time + (int)Math.ceil((mw-time)/(k*1.0));
			}
			else
			{
				mw = mw-time-k;
				time++;
				while(mw>pq.peek())
				{
					mw-=k;
					time++;
				}
				pq.add(mw);
			}
		}
		return time;
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
