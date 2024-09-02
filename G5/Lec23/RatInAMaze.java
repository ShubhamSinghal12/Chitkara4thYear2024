package Lec23;

public class RatInAMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}};
		ratInaMaze(maze, 0, 0, "");

	}
	
	public static void ratInaMaze(int[][] maze,int cr,int cc,String ans)
	{
		if(cr == maze.length-1 && cc == maze[0].length-1)
		{
			System.out.println(ans);
		}
		else if(cr < 0 || cr >= maze.length || cc < 0|| cc >= maze[0].length || maze[cr][cc] >= 1)
		{
			return;
		}
		else
		{
			maze[cr][cc] = 2;
			ratInaMaze(maze, cr-1, cc, ans+"U");
			ratInaMaze(maze, cr, cc+1, ans+"R");
			ratInaMaze(maze, cr+1, cc, ans+"D");
			ratInaMaze(maze, cr, cc-1, ans+"L");
			maze[cr][cc] = 0;
		}
	}

}
