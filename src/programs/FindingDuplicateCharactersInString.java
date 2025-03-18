package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindingDuplicateCharactersInString {
	
	public static void main(String[] args) {
		String s = "googlegoollegjhjsd";
		char[] c = s.toLowerCase().toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (char ch : c) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		
		System.out.println(hm);
		
		for(Entry<Character, Integer> entries : hm.entrySet())
		{
			char key = entries.getKey();
			int value = entries.getValue();
			
			if(value > 1)
            {
                System.out.println(key + " is repeated " + value + " times");				
			}
		}
		
	}
	
	

}
