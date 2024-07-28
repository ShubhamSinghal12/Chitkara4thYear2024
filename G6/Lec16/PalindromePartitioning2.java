package Lec16;

import java.util.ArrayList;

public class PalindromePartitioning2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pp("nitinn","");
		ArrayList<ArrayList<String>> bigAns = new ArrayList<ArrayList<String>>();
		pp("nitin", new ArrayList<String>(),bigAns);
		System.out.println(bigAns);

	}
	
	public static void pp(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 1; i <= ques.length() ;i++)
			{
				String part = ques.substring(0,i);
				if(isPalindrome(part))
				{
					String rem = ques.substring(i);
					pp(rem,ans+part+"-");
				}
			}
		}
	}
	
	
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i < j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
			else
			{
				i++;
				j--;
			}
		}
		return true;
		
	}
	
	
	public static void pp(String ques,ArrayList<String> ans,ArrayList<ArrayList<String>> bigAns)
	{
		if(ques.length() == 0)
		{
			bigAns.add(new ArrayList<String>(ans));
		}
		else
		{
			for(int i = 1; i <= ques.length() ;i++)
			{
				String part = ques.substring(0,i);
				if(isPalindrome(part))
				{
					String rem = ques.substring(i);
					ans.add(part);
					pp(rem,ans,bigAns);
					ans.remove(ans.size()-1);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
