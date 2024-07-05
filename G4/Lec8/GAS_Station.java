package Lec8;

public class GAS_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int canCompleteCircuit(int[] gas, int[] cost) {
		
		int sum = 0;
		int i = 0;
		int start = 0;
		int total = 0;
		while(i < gas.length)
		{
			total += gas[i]-cost[i];
			sum = sum + gas[i]-cost[i];
			if(sum < 0)
			{
				sum = 0;
				start = i+1;
			}
			i++;
		}
		
		return total < 0? -1: start;
    }

}
