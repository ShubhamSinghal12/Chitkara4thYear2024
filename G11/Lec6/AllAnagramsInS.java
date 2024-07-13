package Lec6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagramsInS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findAnagrams("cbaebabacd", "abc"));

	}
	
public static List<Integer> findAnagrams(String s, String p) {
       
		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] freqp = new int[26];
		int[] freqs = new int[26];
		
		for(int i = 0; i < p.length(); i++)
		{
			freqp[p.charAt(i)-'a']++;
		}
		
		for(int i = 0; i < p.length();i++)
		{
			freqs[s.charAt(i)-'a']++;
		}
		
		if(Arrays.equals(freqp, freqs))
		{
			al.add(0);
		}
		
		for(int i = p.length(); i< s.length(); i++)
		{
			freqs[s.charAt(i)-'a']++;
			freqs[s.charAt(i-p.length())-'a']--;
			
			if(Arrays.equals(freqp, freqs)) al.add(i-p.length()+1);
		}
		
		return al;
    }

}
