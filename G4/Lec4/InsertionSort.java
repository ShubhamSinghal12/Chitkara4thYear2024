package Lec4;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,5,2,4};
		
		for(int i= 1; i <arr.length;i++)
		{
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
		}
//			for(int j = i-1; j >= 0; j--)
//			{
//				if(arr[j]>arr[i])
//				{
//					arr[j+1] = arr[j];
//				}
//				else {
//					arr[j+1] = temp;
//					break;
//				}
//			}

	}

}
