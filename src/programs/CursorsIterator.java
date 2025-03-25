package programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CursorsIterator {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		s.add("Dushyant");
		s.add("Shraddha");
		s.add("Arya");
		s.add("Dushyant");
		
		Iterator<String> itr = s.iterator();
	
		itr.forEachRemaining(System.out::println);
		
	}
}
