package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class ProgramToRemoveSecondHighestElementfromHashMap {

	public static void main(String[] args) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 90);
		hm.put(4, 40);
		hm.put(5, 50);
		hm.put(6, 60);
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int key=0;
		
		for(Entry<Integer, Integer> entries : hm.entrySet())
		{
			if(entries.getValue() > max)
			{
				secondMax = max;
				max = entries.getValue();
			}
			else if(entries.getValue() > secondMax)
			{
				secondMax = entries.getValue();
				key = entries.getKey();
			}
		}
		
		System.out.println(max);
		System.out.println(secondMax);
		
		hm.remove(key);
		
		System.out.println(hm);

		

	}

}
