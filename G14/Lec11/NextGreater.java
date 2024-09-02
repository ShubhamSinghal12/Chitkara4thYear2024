package Lec11;

import java.util.HashMap;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];
		
		Stack<Integer> st = new Stack<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums2.length;i++)
		{
			while(!st.isEmpty() && nums2[st.peek()] < nums2[i])
			{
				int t = st.pop();
				map.put(nums2[t], nums2[i]);
			}
			st.push(i);
		}
		
		for(int i = 0; i < nums1.length; i++)
			ans[i] = map.getOrDefault(nums1[i], -1);
		
		return ans;
	}

}
