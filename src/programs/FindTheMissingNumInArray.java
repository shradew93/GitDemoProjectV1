package programs;

public class FindTheMissingNumInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };
		System.out.println("Missing number is: " + findMissingNum(arr));
	}

	private static int findMissingNum(int[] arr)
	{
		int sum1=0, sum2=0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum1 = sum1 + arr[i];
		}
		System.out.println(sum1);
		for(int i=1; i<=arr.length+1; i++)
		{
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		
		return (sum2-sum1);
		
	}

}
