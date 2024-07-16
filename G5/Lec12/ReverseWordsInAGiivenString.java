package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInAGiivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
//		String[] strs = st.split("\\.");
		int prev = st.length();
		for(int i = st.length()-1; i >= 0; i--)
		{
			if(st.charAt(i) == '.')
			{
				System.out.print(st.substring(i+1,prev)+".");
				prev = i;
			}
		}
		System.out.print(st.substring(0,prev));
//		System.out.println(Arrays.toString(strs));

	}

}
