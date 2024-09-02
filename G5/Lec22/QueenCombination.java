package Lec22;

public class QueenCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[][] board = new boolean[4][4];
		qc(board, 0, 0, 0, 4, "");

	}
	
	public static void qc(boolean[][] board,int cr,int cc,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else if(cr>=board.length)
		{
			return;
		}
		else if(cc >= board[0].length)
		{
			qc(board, cr+1, 0, qpsf, tq, ans);
		}
		else
		{
			if(isValid(board, cr, cc))
			{
				board[cr][cc] = true;
				qc(board, cr, cc+1, qpsf+1, tq, ans+"qb"+cr+cc+" ");
				board[cr][cc] = false;
			}
			
			qc(board, cr, cc+1, qpsf, tq, ans);
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
