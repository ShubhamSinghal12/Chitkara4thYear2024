package Lec13;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PI(1,5);
//		PD(5);
		System.out.println(fib(7));

	}
	
	public static void PI(int i,int n)
	{
		if(i > n) 
		{
			return;
		}
		else
		{
			System.out.println(i);
			PI(i+1,n);
		}
	}
	
	public static void PD(int n)
	{
		if(n == 0) 
		{
			return;
		}
		else
		{
			System.out.println(n);
			PD(n-1);
		}
	}
	
	public static int fib(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	
	
	
	
	
	
	
	
	
	

}
