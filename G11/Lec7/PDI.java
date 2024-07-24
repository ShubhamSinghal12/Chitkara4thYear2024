package Lec7;

public class PDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDI(5);

	}
	
	public static void PDI(int n)
	{
		if(n == 1)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println(n);
			PDI(n-1);
			System.out.println(n);
		}
	}

}
