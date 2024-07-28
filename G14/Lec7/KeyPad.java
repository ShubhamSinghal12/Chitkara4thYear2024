package Lec7;

import java.awt.RenderingHints.Key;

public class KeyPad {

	public static String[] map = {"","abc","def","ghi"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void keyPad(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
		}
		else {
			int m = ques.charAt(0)-'0';
			String st = map[m];
			for(int i = 0; i <st.length(); i++)
			{
				keyPad(ques.substring(1),ans+st.charAt(i));
			}
		}
	}
	
	
	

}
