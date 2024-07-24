package Lec14;

public class SubSequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ss("abc","");

	}
	
	public static void ss(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		else
		{
			ss(ques.substring(1),ans);
			ss(ques.substring(1),ans+ques.charAt(0));
		}
	}
	
	
	public static int ct(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			if(!ans.endsWith("H"))
			{
				count += ct(n-1,ans+'H');
			}
			count += ct(n-1,ans+'T');
			return count;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
