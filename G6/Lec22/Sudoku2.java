package Lec22;

import java.util.Arrays;

public class Sudoku2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {
				{1,0,7,0,0,6,4,5,0},
				{0,2,5,3,4,0,0,0,8},
				{0,6,0,0,0,1,0,7,0},
				{0,5,3,0,0,0,0,2,9},
				{6,1,0,0,0,9,8,0,0},
				{0,0,0,6,0,2,0,0,7},
				{0,0,1,0,9,3,2,0,0},
				{0,0,8,0,0,0,0,0,0},
				{0,4,0,0,7,8,5,9,1}
		};
		ss(grid, 0, 0);

	}
	
	public static void ss(int[][] grid,int cr,int cc)
	{
		if(cr == grid.length)
		{
			for(int[]i: grid)
			{
				System.out.println(Arrays.toString(i));
			}
			System.out.println();
		}
		else if(cc == grid[0].length)
		{
			ss(grid, cr+1, 0);
		}
		else if(grid[cr][cc] != 0)
		{
			ss(grid, cr, cc+1);
		}
		else
		{
			for(int i = 1; i <= 9; i++)
			{
				if(isValid(grid, cr, cc, i))
				{
					grid[cr][cc] = i;
					ss(grid, cr, cc+1);
					grid[cr][cc] = 0;
				}
			}
		}
	}
	
	public static boolean isValid(int[][] grid,int cr,int cc,int val)
	{
		return true;
	}

}
