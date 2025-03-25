package programs;

public class SumOfPrimeNums {
	
	public static void main(String[] args) {
		
		int[] arr = {5, 11, 7, 9, 6};
		
		System.out.println(sumOfPrimeNo(arr));
		

	}
	
	private static int sumOfPrimeNo(int[] arr)
	{
		int sum=0;
		int[] primeArray = null;
		for(int i=0; i<arr.length; i++)
		{
			if(isPrime(arr[i]))
			{
				sum = sum + arr[i];
				primeArray = new int[] {arr[i]};
				
				for(int j=0; j<primeArray.length; j++)
				{
					System.out.print(primeArray[j]+" ");
				}
			}
			
		}
		System.out.println();
		return sum;
		
	}
	
	private static boolean isPrime(int num)
	{
		boolean flag = true;
		for(int i=2; i<num/2; i++)
		{
		
			if(num%i!=0)
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		return flag;
	}

}
