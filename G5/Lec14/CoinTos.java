package Lec14;

public class CoinTos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coinToss(4, ""));

	}
	
	
	public static int coinToss(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			if(ans.length()==0 || !ans.endsWith("H"))
			{
				count += coinToss(n-1, ans+"H");
			}
			count += coinToss(n-1, ans+"T");
			return count;
		}
	}

}
