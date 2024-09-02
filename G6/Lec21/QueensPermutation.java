package Lec21;

public class QueensPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		qp(new boolean[4], 0, 2, "");
//		qc(new boolean[4], 0, 2,0, "");
//		qc(new boolean[2][4], 0, 2, 0, 0,"");
		qc2(new boolean[4][4], 0, 0, 0, 4, "");

	}
	
	public static void qp(boolean[] board,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length;i++)
			{
				if(board[i] == false)
				{
					board[i] = true;
					qp(board, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ");
					board[i] = false;
				}
			}
		}
	}
	
	public static void qp(boolean[][] board,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length;i++)
			{
				for(int j = 0 ; j<board[i].length; j++)
				{	
					if(board[i][j] == false)
					{
						board[i][j] = true;
						qp(board, qpsf+1, tq, ans+"q"+qpsf+"b"+i+j+" ");
						board[i][j] = false;
					}
				}
			}
		}
	}
	
	public static void qc(boolean[] board,int qpsf,int tq,int lp,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lp; i < board.length;i++)
			{
				if(board[i] == false)
				{
					board[i] = true;
					qc(board, qpsf+1, tq, i,ans+"q"+qpsf+"b"+i+" ");
					board[i] = false;
				}
			}
		}
	}
	
	
	public static void qc(boolean[][] board,int qpsf,int tq,int lr,int lc,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lr; i < board.length;i++)
			{
				int j = 0;
				
				if(i == lr)
					j = lc;
				
				for( ; j<board[i].length; j++)
				{	
					if(board[i][j] == false)
					{
						board[i][j] = true;
						qc(board, qpsf+1, tq,i,j, ans+"q"+"b"+i+j+" ");
						board[i][j] = false;
					}
				}
			}
		}
	}
	
	
	public static void qc2(boolean[][] board,int cr,int cc,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else if(cr >= board.length)
		{
			return;
		}
		else if(cc >= board[0].length)
		{
			qc2(board, cr+1,0, qpsf, tq, ans);
		}
		else
		{
			if(isValid(board, cr, cc))
			{
				board[cr][cc] = true;
				qc2(board, cr, cc+1, qpsf+1, tq, ans+"qb"+cr+cc+" ");
				board[cr][cc] = false;
			}
			
			qc2(board, cr, cc+1, qpsf, tq, ans);
		}
	}
	
	public static boolean isValid(boolean[][] board,int cr,int cc)
	{
		//Left Dir
		for(int j = cc; j >= 0; j--)
			if(board[cr][j] == true)
				return false;
		
		//Upper Left Diag
		for(int i =cr,j=cc; i>=0 && j>=0; i--,j--)
			if(board[i][j])
				return false;
		
		//Upper
		for(int i = cr; i >= 0; i--)
			if(board[i][cc])
				return false;
		
		//Upper Right Diag
		for(int i=cr,j=cc; i>=0 && j<board[0].length; i--,j++)
			if(board[i][j])
				return false;
		
		return true;
	}
	
	
	
	
	
	
	
	
	

}
