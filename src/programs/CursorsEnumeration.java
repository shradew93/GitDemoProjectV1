package programs;

import java.util.Enumeration;
import java.util.Vector;

public class CursorsEnumeration {

	public static void main(String[] args) {
		
		Vector<String> s = new Vector<>();
		s.add("Dushyant");
		s.add("Shraddha");
		s.add("Arya");
		s.add("Dushyant");
		
		s.forEach(System.out::println);
		
		Enumeration<String> en = s.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		
	}
}
