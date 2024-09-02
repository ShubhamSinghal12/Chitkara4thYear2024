package Lec18;

public class MazePathD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3,n = 2;
		mp(0, 0, m-1, n-1, "");

	}
	
	public static int mp(int cr,int cc,int m,int n,String ans)
	{
		if(cr == m&&cc == n)
		{
			System.out.println(ans);
			return 1;
		}
		else if(cr > m || cc > n)
		{
			return 0;
		}
		else
		{
			int count = 0;
			count += mp(cr+1, cc, m, n, ans+"V");
			count += mp(cr, cc+1, m, n, ans+"H");
			count += mp(cr+1, cc+1, m, n, ans+"D");
			return count;
		}
	}

}
