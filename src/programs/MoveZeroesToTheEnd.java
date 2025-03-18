package programs;

import java.util.Arrays;

public class MoveZeroesToTheEnd {
	
	public static void main(String[] args) {
		int[] arr = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] != 0 && arr[j] == 0) 
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			else
			{
				if (arr[j] != 0) {
					j++;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	

}
