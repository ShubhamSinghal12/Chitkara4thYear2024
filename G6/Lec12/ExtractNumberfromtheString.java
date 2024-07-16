package Lec12;

import java.util.Scanner;

public class ExtractNumberfromtheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int ans = 0;
		int num = 0;
		for(int i = 0; i < st.length(); i++)
		{
			if(st.charAt(i) >= '0' && st.charAt(i) < '9')
			{
				num = num*10 + st.charAt(i)-'0';
				ans = Math.max(ans, num);
			}
			else
			{
				num = 0;
			}
		}
		System.out.println(ans);
		

	}

}
