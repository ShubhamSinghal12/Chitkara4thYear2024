package Lec7;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toh(3, "T1", "T3", "T2"));
	}
	
	public static int toh(int n,String src,String dest,String from)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			int count = 1;
			count += toh(n-1, src, from, dest);
			System.out.println("Move "+n+"th from "+src+" to "+dest);
			count+= toh(n-1,from,dest,src);
			return count;
		}
	}

}
