package Lec7;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	public static ArrayList<String> ss1(String s)
	{
		if(s.length() == 0)
		{
			return new ArrayList<String>(Arrays.asList(""));
		}
		else
		{
			ArrayList<String> rr = ss1(s.substring(1));
			ArrayList<String> ans = new ArrayList<String>();
			
			for(String st:rr)
			{
				ans.add(st);
				ans.add(s.charAt(0)+st);
			}
			return ans;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
