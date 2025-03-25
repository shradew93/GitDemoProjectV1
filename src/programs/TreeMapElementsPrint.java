package programs;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapElementsPrint {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		map.put(4, "Four");
		map.put(1, "One");
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(5, "Five");
		
		//Sorting the elements in ascending order by default
		System.out.println("TreeMap elements:" + map);
		
		//Iterating through the elements
		map.forEach((key, value) ->System.out.println("Key: " + key + ", Value: " + value));
		
		//Iterating through the keys
		map.keySet().forEach(key->System.out.println(key+"->"+map.get(key)));
		
		//Iterating through the entries
		map.entrySet().forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));
		
	}

}
