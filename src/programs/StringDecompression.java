package programs;

public class StringDecompression {
	
	public static void main(String[] args) {
		
		String s = "abca2b3c3";
		
		System.out.println(stringDecompress(s));
		
	}
	
	private static String stringDecompress(String s)
	{
		String str = "";
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				str = str+s.charAt(i);
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				int count = Character.getNumericValue(s.charAt(i));
				for(int j=1; j<count; j++)
				{
					str = str + s.charAt(i-1);
				}
			}
		}
		
		return str;
	}

}
