package programs;

import java.util.Arrays;
import java.util.HashMap;

public class FindTheIndicesWhoseSumEqualToGivenNum {
	
	static int[] arr1;

	public static void main(String[] args) {
		
		int num = 9;
		int[] arr= {7, 4, 6, 2, 3, 1};
		
		System.out.println(findIndices(arr, num));
		
	}
	
	private static String findIndices(int[] arr, int num)
	{
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		
		
		for(int i=0; i<arr.length; i++)
		{
			int extra = num - arr[i];
			if(hm.containsKey(extra))
			{
				arr1 = new int[] {hm.get(extra), i};
				//break; to find the first matched set
			}
			hm.put(arr[i], i);
		}
		
		return Arrays.toString(arr1);

	}
}
