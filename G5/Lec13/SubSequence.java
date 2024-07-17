package Lec13;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SubSequence("abc"));

	}
	public static ArrayList<String> SubSequence(String s)
	{
		if(s.length() == 0)
		{
			return new ArrayList<>(Arrays.asList(""));
		}
		else
		{
			ArrayList<String> rr = SubSequence(s.substring(1));
			ArrayList<String> ans = new ArrayList<String>();
			for(String st: rr)
			{
				ans.add(st);
				ans.add(s.charAt(0)+st);
			}
			return ans;
		}
	}
	
	
	
	
	
	

}
