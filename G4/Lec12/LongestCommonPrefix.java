package Lec12;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 0)
		{
			System.out.println("");
			return;
		}
		String[] strs = new String[n];
		for(int i = 0; i < n; i++)
		{
			strs[i] = sc.next();
		}
		String s = strs[0];
		for(int i = s.length(); i >= 0; i--)
		{
			String prefix = s.substring(0,i);
			boolean flag = true;
			for(String st : strs)
			{
				if(!st.startsWith(prefix))
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(prefix);
				break;
			}
		}
		
		

	}

}
