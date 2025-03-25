package programs;

public class SumOfDigitsTillSingleDigit {
	
	public static void main(String[] args) {
		
		System.out.println(sumTillSingleDigit(1234568));
	}
	private static int sumTillSingleDigit(int num)
	{
			while(num >= 10)			
			{
				num = sumOfDigits(num);
			}
		
		return num;
	}
	
	private static int sumOfDigits(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum + rem;
			num=num/10;
		}
		return sum;
	}

}
