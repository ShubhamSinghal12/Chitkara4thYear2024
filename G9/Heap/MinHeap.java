package Heap;

import java.util.ArrayList;

public class MinHeap {

	
	ArrayList<Integer> data = new ArrayList<Integer>();
	public boolean isEmpty()
	{
		return data.isEmpty();
	}
	public int size()
	{
		return data.size();
	}
	public void add(int n)
	{
		data.add(n);
		upHeapify(data.size()-1);
	}
	private void upHeapify(int ci)
	{
		int pi = (ci-1)/2;
		
		while(ci > 0 && data.get(ci) < data.get(pi))
		{
			int t = data.get(ci);
			data.set(ci, data.get(pi));
			data.set(pi, t);
			
			ci = pi;
			pi = (ci-1)/2;
		}
	}
	
	public int getMin()
	{
		return data.get(0);
	}
	public int remove()
	{
		int r = data.get(0);
		
		int t = data.get(0);
		data.set(0, data.get(data.size()-1));
		data.set(data.size()-1, t);
		data.remove(data.size()-1);
		
		downHeapify(0);
		return r;
	}
	private void downHeapify(int pi)
	{
		int min = pi;
		int c1 = 2*pi+1;
		int c2 = 2*pi+2;
		
		if(c1 < data.size() && data.get(c1) < data.get(min))
			min = c1;
		if(c2 < data.size() && data.get(c2) < data.get(min))
			min = c2;
		
		if(min != pi)
		{
			int t = data.get(min);
			data.set(min, data.get(pi));
			data.set(pi, t);
			downHeapify(min);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
