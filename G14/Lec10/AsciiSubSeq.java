package Lec10;

public class AsciiSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(asciiSS("ab", ""));

	}
	
	public static int asciiSS(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			count += asciiSS(ques.substring(1), ans);
			count += asciiSS(ques.substring(1), ans+ques.charAt(0));
			count += asciiSS(ques.substring(1), ans+(int)ques.charAt(0));
			return count;
		}
	}

}
