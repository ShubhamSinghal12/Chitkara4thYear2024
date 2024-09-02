package Lec21;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		qp(new boolean[4], 0, 2, "");
		qc(new boolean[4], 0, 2, 0, "");

	}
	public static void qp(boolean[] board,int qpsf,int tq,String ans)
	{
		if(qpsf == tq)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length; i++)
			{
				if(!board[i])
				{
					board[i] = true;
					qp(board, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ");
					board[i] = false;
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
			for(int i = lp; i < board.length; i++)
			{
				if(!board[i])
				{
					board[i] = true;
					qc(board, qpsf+1, tq, i,ans+"q"+"b"+i+" ");
					board[i] = false;
				}
			}
		}
	}

}
