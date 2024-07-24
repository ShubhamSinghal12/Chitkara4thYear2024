package Lec15;

public class PasswordCracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pc("code2acad3",10));

	}
	
	public static char pc(String s,int k)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				sb.append(s.charAt(i));
				if(sb.length()==k)
					return sb.charAt(k-1);
			}
			else
			{
				StringBuilder nsb = new StringBuilder(sb);
				int digit = s.charAt(i)-'0';
				for(int j = 1; j < digit; j++)
				{
					for(int l = 0; l < sb.length(); l++)
					{
						nsb.append(sb.charAt(l));
						if(nsb.length()==k)
							return nsb.charAt(k-1);
					}
				}
				sb = nsb;
			}
		}
		return sb.charAt(k-1);
	}
}
