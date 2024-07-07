package Lec4;

import java.util.HashSet;

public class LongestSubStringWihoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public int lengthOfLongestSubstring(String s) {
        
		HashSet<Character> hs = new HashSet<Character>();
		int ans = 0;
		int start = 0;
		for(int end = 0; end < s.length(); end++)
		{
			while(hs.contains(s.charAt(end)))
			{
				hs.remove(s.charAt(start));
				start++;
			}
			hs.add(s.charAt(end));
			ans = Math.max(ans, end-start+1);
		}
		return ans;
    }

}
