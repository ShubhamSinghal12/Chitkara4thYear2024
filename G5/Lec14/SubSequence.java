package Lec14;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ss1("abc","");

	}
	public static void ss1(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		else
		{
			ss1(ques.substring(1), ans);
			ss1(ques.substring(1),ans+ques.charAt(0));
		}
	}
	
	
	public static void ss2(int i,String ques,String ans)
	{
		if(ques.length() == i)
		{
			System.out.println(ans);
			return;
		}
		else
		{
			ss2(i+1,ques, ans);
			ss2(i+1,ques,ans+ques.charAt(i));
		}
	}
	
	
	

}
