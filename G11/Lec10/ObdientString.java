package Lec10;

public class ObdientString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean ob(String s,int turn)
	{
		if(s.length() == 0)
		{
			return true;
		}
		else if(turn == 0)
		{
			if(s.startsWith("a"))
				return ob(s.substring(1), 0);
			else if(s.startsWith("bb"))
				return ob(s.substring(2),1);
			else
				return false;
		}
		else
		{
			if(s.startsWith("a"))
				return ob(s.substring(1), 0);
			else
				return false;
		}
	}

}
