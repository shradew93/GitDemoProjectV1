package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "John", 25, 50000);
		Employee emp2 = new Employee(102, "Mike", 30, 60000);
		Employee emp3 = new Employee(103, "David", 35, 70000);
		Employee emp4 = new Employee(104, "Sam", 40, 80000);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
	}

}

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private int age;
	private double salary;

	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		
		return id + " " + name + " " + age + " " + salary;
	}
	
	@Override
	public int compareTo(Employee emp)
	{
		int result = (this.id > emp.id) ? -1 : (this.id < emp.id) ? 1 : 0;
		
		return result;
	}

}
