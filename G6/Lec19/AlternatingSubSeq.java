package Lec19;

public class AlternatingSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ass(new int[] {4,2,5,3},0,1));
	}
	
	public static int ass(int[] arr,int i,int oe)
	{
		if(i == arr.length)
		{
			return 0;
		}
		else
		{
			int inc = 0;
			if(oe == 1)
			{
				inc = ass(arr,i+1,2)+arr[i];
			}
			else
			{
				inc = ass(arr,i+1,1)-arr[i];
			}
			int exc = ass(arr,i+1,oe);
			return Math.max(inc, exc);
		}
	}

}
