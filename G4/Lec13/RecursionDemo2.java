package Lec13;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDI(1,5);

	}
	
	public static void PDI(int i, int n)
	{
		if(n+1==i) 
		{
//			System.out.println(n);
			return;
		}
		else
		{
			System.out.println(i);
			PDI(i+1,n);
			System.out.println(i);
		}
	}
	
	
	public static void PD(int n)
	{
		if(n==0) 
		{
			return;
		}
		else
		{
			PD(n-1);
			System.out.println(n);
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
