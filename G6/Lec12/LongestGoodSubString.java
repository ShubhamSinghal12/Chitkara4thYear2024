package Lec12;

import java.util.HashSet;
import java.util.Scanner;

public class LongestGoodSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		
		int ans = 0;
		HashSet<Character> hs = new HashSet<Character>();
		int start = 0;
		
		for(int end = 0 ; end < st.length(); end++)
		{
			while(hs.contains(st.charAt(end)))
			{
				hs.remove(st.charAt(start));
				start++;
			}
			hs.add(st.charAt(end));
			
			ans = Math.max(ans, hs.size());
		}
		System.out.println(ans);

	}

}
