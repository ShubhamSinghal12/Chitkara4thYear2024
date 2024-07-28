package Lec9;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4,n=3;
		mp(0, 0, m-1, n-1, "");

	}
	public static void mp(int cr,int cc,int m,int n,String ans)
	{
		if(cr == m && cc == n)
		{
			System.out.println(ans);
		}
		else if(cr > m || cc > n)
		{
			return;
		}
		else
		{
			mp(cr+1, cc, m, n, ans+"V");
			mp(cr, cc+1, m, n, ans+"H");
		}
	}

}
