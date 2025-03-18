package programs;

public class FindLongestPalindromeSubString {
	
	public static void main(String[] args) {
		
		System.out.println(findLongestPalindromeSubString("aba1cdffdcaba"));
	}

	private static String findLongestPalindromeSubString(String s)
    {
		int max=0;
		String longestPalindrome="";
        for(int i = 0; i < s.length(); i++)
        {
        	for(int j=s.length()-1; j>=i; j--)
        	{
        		if(isPalindrome(s.substring(i, j+1)))
        		{
        			if(findLength(s.substring(i, j+1)) > max)
        			{
        				max = findLength(s.substring(i, j+1));
        				longestPalindrome = s.substring(i, j+1);
        			}
        		}
        	}
        }
        return longestPalindrome;
    }
 	
	private static int findLength(String s)
	{
		return s.length();
	}
	
	private static boolean isPalindrome(String s)
	{
		s = s.toLowerCase();
		
		boolean flag=true;
		
		for(int i = 0; i < s.length()/2; i++)
		{
			if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
				flag=true;
			}
			else
			{
				flag = false;
				break;
			}
		}
		
		return flag;
		
		
	}

}
