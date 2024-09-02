package Lec18;

public class TrickyPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permu("aba", "");

	}
	
	public static void permu(String ques,String ans)
	{
		if(ques.length() == 0){
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length(); i++)
			{
				String nq = ques.substring(0,i)+ques.substring(i+1);
				if(ques.indexOf(ques.charAt(i)) == i)
					permu(nq, ans+ques.charAt(i));
			}
		}
	}

}
