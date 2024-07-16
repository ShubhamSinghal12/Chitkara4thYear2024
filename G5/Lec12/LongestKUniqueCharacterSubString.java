package Lec12;

import java.util.HashSet;
import java.util.Scanner;

public class LongestKUniqueCharacterSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			String st = sc.next();
			int k = sc.nextInt();
			
			int ans = -1;
			for(int i = 0 ; i < st.length();i++)
			{
				HashSet<Character> hs = new HashSet<Character>();
				for(int j = i; j < st.length(); j++)
				{
					hs.add(st.charAt(j));
					if(hs.size() == k)
					{
						ans = Math.max(j-i+1, ans);
					}
				}
			}
			System.out.println(ans);
		}

	}

}
