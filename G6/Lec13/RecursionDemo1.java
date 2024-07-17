package Lec13;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PD(5);

	}
	
	
	
	public static void PD(int n)
	{
		if(n==0)
		{
			return;
		}
		else
		{
			System.out.println(n);
			PD(n-1);
		}
	}

	
	public static int fib(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	
	
	
	public static ArrayList<String> sub(String s)
	{
		if(s.length() == 0)
		{
			return new ArrayList<String>(Arrays.asList(""));
		}
		else
		{
			ArrayList<String> rr = sub(s.substring(1));
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
