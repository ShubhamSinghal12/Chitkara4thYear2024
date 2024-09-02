package Lec24;

import java.util.Arrays;

public class Sudoku {

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
		sudoku(grid, 0, 0);

	}
	
	public static void sudoku(int[][] grid,int cr,int cc)
	{
		if(cr == grid.length)
		{
			for(int[] i:grid)
			{
				System.out.println(Arrays.toString(i));
			}
			System.out.println();
		}
		else if(cc == grid[0].length)
		{
			sudoku(grid, cr+1, 0);
		}
		else if(grid[cr][cc] != 0)
		{
			sudoku(grid, cr, cc+1);
		}
		else
		{
			for(int i = 1; i <= 9; i++)
			{
				if(isValid(grid, cr, cc, i))
				{
					grid[cr][cc] = i;
					sudoku(grid, cr, cc+1);
					grid[cr][cc] = 0;
				}
			}
		}
	}
	
	public static boolean isValid(int[][] grid,int cr,int cc,int val)
	{
		for(int j = 0; j < grid[0].length; j++)
			if(grid[cr][j] == val)
				return false;
		
		for(int i = 0; i < grid.length; i++)
		{
			if(grid[i][cc] == val)
				return false;
		}
		
		int i = cr - cr%3;
		int j = cc - cc%3;
//		System.out.println(i+" "+j);
		for(int ni = i;ni < i+3; ni++)
			for(int nj = j;nj < j+3; nj++)
				if(grid[ni][nj] == val)
					return false;
		
		return true;
	}

}
