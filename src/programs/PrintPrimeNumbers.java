package programs;

public class PrintPrimeNumbers {
	public static void main(String[] args) {
		
		for(int i=2; i<=100; i++)
		{
			if(isPrimeNum(i))
			{
				System.out.println(i);
			}
		}
	}
	
	private static boolean isPrimeNum(int num)
	{
		boolean flag = true;
		for(int i=2; i<=num/2; i++)
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
