package Lec6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sadhajadgnasfsg";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String sst = String.valueOf(ch);
		System.out.println(sst);
		

	}
	
	public List<List<String>> groupAnagrams(String[] strs)
	{
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		for(String s : strs)
		{
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String sst = String.valueOf(ch);
			if(!hm.containsKey(sst))
			{
				hm.put(sst, new ArrayList<String>(Arrays.asList(s)));
			}
			else
			{
				hm.get(sst).add(s);
			}
		}
		
		return new ArrayList<>(hm.values());	
		
	}
	

}
