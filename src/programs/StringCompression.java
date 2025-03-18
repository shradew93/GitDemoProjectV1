package programs;

public class StringCompression {
	
	public static void main(String[] args) {
		String s = "abcaabbbccc";
		int count=0;
		char c = s.charAt(0);
		String str="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
			else
			{
				str = str+c;
				if(count > 1)
				{
					str = str+count;
					count=1;
				}
				c = s.charAt(i);
			}
			
			if(i==s.length()-1)
			{
				str = str+c;
				if(count > 1)
				{
					str = str+count;
					count=1;
				}
			}
		}
		
		System.out.println(str);
	}
	

}
