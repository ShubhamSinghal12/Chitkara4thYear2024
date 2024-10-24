package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(100);
		pq.add(10);
		pq.add(200);
		pq.add(20);
		pq.add(30);
		
		System.out.println(pq);

	}

}
