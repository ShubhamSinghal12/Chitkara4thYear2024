package Lec7;

public class Codie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void codie(int n,int k,int cur,int count)
	{
		if(count == n)
		{
			System.out.println(cur);
		}
		else
		{
			for(int i = 0; i <= 9; i++)
			{
				if(Math.abs(i-cur%10) == k)
				{
					codie(n,k,cur*10+i,count+1);
				}
			}
		}
	}

}
