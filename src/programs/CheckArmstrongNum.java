package programs;

public class CheckArmstrongNum {
	
	public static void main(String[] args) {
		
		System.out.println(isArmstrong(153));
	}
	
	private static int findLength(int num)
	{
		int length=0;
		while(num!=0)
		{
			int rem = num % 10;
			num = num/10;
			length++;
		}
		return length;
	}
	
	private static boolean isArmstrong(int num)
	{
		int length = findLength(num);
		int temp=num;		
		int sum=0;
		while(temp!=0)
		{
			int mul=1;
			int rem = temp % 10;
			
			for(int i=0; i<length; i++)
			{			
				mul = mul * rem;
				
			}
			temp=temp/10;
			
			sum=sum + mul;
		}
		
		if(sum==num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
