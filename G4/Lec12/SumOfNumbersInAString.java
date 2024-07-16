package Lec12;

import java.util.Scanner;

public class SumOfNumbersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			String st = sc.next();
			
			long num = 0;
			long sum = 0;
			
			for(int i = 0 ; i < st.length(); i++)
			{
				if(st.charAt(i) >= '0' && st.charAt(i) <= '9')
				{
					num = num*10+(st.charAt(i)-'0');
				}
				else
				{
					sum += num;
					num = 0;
				}
			}
			sum += num;
			System.out.println(sum);
		}
	}
}
