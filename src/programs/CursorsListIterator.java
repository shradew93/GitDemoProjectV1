package programs;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CursorsListIterator {
	
	public static void main(String[] args) {
		
		List<String> s = new LinkedList<>();
		s.add("Dushyant");
		s.add("Shraddha");
		s.add("Arya");
		
		ListIterator<String> itr = s.listIterator();
		
		itr.forEachRemaining(System.out::println);
		
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
