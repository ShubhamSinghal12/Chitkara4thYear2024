package Lec11;

public class QueensPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qp(new boolean[4], 0, 2, "");

	}
	public static void qp(boolean[] board,int qpsf,int tq,String ans)
	{
		if(qpsf==tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length; i++)
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
		if(qpsf==tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length; i++)
			{
				for(int j = 0; j < board[i].length; i++)
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

}
