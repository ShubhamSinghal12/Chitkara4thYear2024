package Lec8;

public class CodesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cos("123","");

	}
	
	public static void cos(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			cos(ques.substring(1), ans+(char)(ques.charAt(0)-'1'+'A'));
			if(ques.length() >= 2)
			{
				int val = Integer.parseInt(ques.substring(0,2))-1;
				cos(ques.substring(2), ans+(char)(val+'A'));
			}
		}
	}

}
