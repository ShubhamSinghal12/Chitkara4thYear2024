package Greedy;

import java.util.ArrayList;
import java.util.Comparator;

public class FractinalKnapSack {

	static class item{
		int price;
		int weight;
		float costPU;
		
		item(int p,int w)
		{
			price = p;
			weight = w;
			costPU = p/w;
		}
		
		@Override
		public String toString()
		{
			return "(P = "+price+", W = "+weight+", CPU = "+costPU+")";
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<item> items = new ArrayList<item>();
		items.add(new item(60,10));
		items.add(new item(100,20));
		items.add(new item(120,30));
		items.add(new item(60,5));
		items.add(new item(80,10));
		
		items.sort(new Comparator<item>() {

			@Override
			public int compare(item o1, item o2) {
				// TODO Auto-generated method stub
				return (int)(o2.costPU-o1.costPU);
			}
		});
		System.out.println(items);

	}
	
	
	
	
	
	
	

}
