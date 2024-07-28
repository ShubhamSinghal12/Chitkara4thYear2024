package Lec9;

public class GeneratePara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void gp(int n,int op, int clo,String ans)
	{
		if(op == n && clo == op)
		{
			System.out.println(ans);
		}
		else if(op > n || clo > op)
		{
			return;
		}
		else
		{
			gp(n, op+1, clo, ans+"(");
			gp(n, op, clo+1, ans+")");
		}
	}

}
