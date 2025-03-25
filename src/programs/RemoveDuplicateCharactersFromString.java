package programs;

public class RemoveDuplicateCharactersFromString {
	
	public static void main(String[] args) {
		
		String s = "geeksforgeeks";
		System.out.println(removeDuplicateCharacters(s));
	
	}
	
	private static String removeDuplicateCharacters(String s) {

		String str ="";
		
		for(int i=0; i<s.length(); i++)
		{
			if (str.contains(String.valueOf(s.charAt(i)))) {
				continue;
			}
			else
			{
				str = str + s.charAt(i);
			}
	
		}
		return str;
	}

}
