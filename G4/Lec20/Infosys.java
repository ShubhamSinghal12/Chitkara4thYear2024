package Lec20;

public class Infosys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int min(int[] arr)
	{
		int c = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == c+1)
				c++;
		}
		return arr.length-c;
	}

}
