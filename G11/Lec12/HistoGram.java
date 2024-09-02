package Lec12;

import java.util.Stack;

public class HistoGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int his(int[] arr)
	{
		int ans = 0;
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[st.peek()] > arr[i])
			{
				int a = st.pop();
				int r = i;
				int l = st.isEmpty() ? -1 : st.peek();
				ans = Math.max(ans, (r-l-1)*arr[a]);
			}
			st.push(i);
		}
		while(!st.isEmpty())
		{
			int a = st.pop();
			int r = arr.length;
			int l = st.isEmpty() ? -1 : st.peek();
			ans = Math.max(ans, (r-l-1)*arr[a]);
		}
		return ans;
	}

}
