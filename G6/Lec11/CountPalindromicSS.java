package Lec11;

public class CountPalindromicSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int oddPss(String s)
	{
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			count++;
			int l = i-1;
			int r = i+1;
			while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
			{
				count++;
				l--;
				r++;
			}
		}
		return count;
	}
	
	public int evenPss(String s)
	{
		int count = 0;
		for(int i = 0; i < s.length()-1; i++)
		{
			int l = i;
			int r = i+1;
			while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
			{
				count++;
				l--;
				r++;
			}
		}
		return count;
	}

}
