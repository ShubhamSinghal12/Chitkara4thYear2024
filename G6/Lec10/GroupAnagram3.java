package Lec10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "safhahfgadgh";
		char[] cha = st.toCharArray();
		Arrays.sort(cha);
		String sst = String.valueOf(cha);
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
