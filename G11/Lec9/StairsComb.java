package Lec9;

public class StairsComb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stairs(4, "",0);

	}
	
	public static void stairs(int n,String ans,int lastP)
	{
		if(n == 0)
		{
			System.out.println(ans);
		}
		else if(n < 0)
		{
			return;
		}
		else
		{
			if(lastP <= 1)
				stairs(n-1, ans+"1",1);
			
			stairs(n-2, ans+"2",2);
		}
	}
}
