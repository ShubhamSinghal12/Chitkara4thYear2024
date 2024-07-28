package Lec17;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void mazePath(int cr,int cc,int m,int n,String path)
	{
		if(cr == m && cc == n)
		{
			System.out.println(path);
			return;
		}
		else if(cr>m || cc > n)
		{
			return;
		}
		else
		{
			mazePath(cr+1, cc, m, n, path+"V");
			mazePath(cr, cc+1, m, n, path+"H");
		}
	}

}
