package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	
	public static void main(String[] args) {
		
		Employees emp1 = new Employees("John", 103);
		Employees emp2 = new Employees("Mike", 101);
		Employees emp3 = new Employees("David", 102);
		
		List<Employees> empList = new ArrayList<Employees>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.println(empList);
		Collections.sort(empList, new SortById());
		System.out.println(empList);
		Collections.sort(empList, new SortByName());
		System.out.println(empList);
	}

}

class Employees
{
	public String name;
	public int id;

	public Employees(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return name	+ " " + id;
	}
}

class SortById implements Comparator<Employees>
{
    public int compare(Employees o1, Employees o2)
    {
    	int result = (o1.id > o2.id)? -1 : o1.id < o2.id? 1 : 0;
    	return result;
    }
}

class SortByName implements Comparator<Employees> {
	public int compare(Employees o1, Employees o2) {
		return o1.name.compareTo(o2.name);
	}
}

