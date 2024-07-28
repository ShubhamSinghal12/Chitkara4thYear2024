package Lec15;

import java.util.Scanner;

public class CodieBhaiya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int n = 3,k = 7;
		for(int i = 1;i <= 9; i++)
		{
			cb(n-1, k, i);
		}
	}
	
	public static void cb(int n,int k,int cur)
	{
		if(n==0)
		{
			System.out.println(cur);
		}
		else
		{
			int lastD = cur%10;
			for(int i = 0; i <= 9; i++)
			{
				if(Math.abs(lastD-i) == k)
				{
					cb(n-1, k, cur*10+i);
				}
			}
		}
	}

}
