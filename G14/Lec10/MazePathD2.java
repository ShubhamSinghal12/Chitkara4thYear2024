package Lec10;

public class MazePathD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3,n = 4;
		mazePath(0, 0, m-1, n-1, "");

	}
	
	public static void mazePath(int cr,int cc,int m,int n,String ans)
	{
		if(cr==m&&cc==n)
		{
			System.out.println(ans);
		}
		else if(cr > m || cc > n)
		{
			return;
		}
		else
		{
			mazePath(cr+1, cc, m, n, ans+"V");
			mazePath(cr, cc+1, m, n, ans+"H");
			if(cr==cc || cr+cc == n)
				mazePath(cr+1, cc+1, m, n, ans+"D");
		}
	}

}
