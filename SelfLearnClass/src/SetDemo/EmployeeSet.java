package SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSet {

	public static void main(String[] args) {
		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee(1, "Ravi"));
		empSet.add(new Employee(2, "Raj"));
		
		for (Employee employee : empSet) {
			System.out.println(employee);
			
		}
		
		Set<Employee> empSet1 = new LinkedHashSet<>();
		empSet1.add(new Employee(1, "Ravi"));
		empSet1.add(new Employee(2, "Raj"));
		
		for (Employee employee : empSet1) {
			System.out.println(employee);
			
		}
		
		Set<Employee> empSet2 = new TreeSet<>(new EmpIDComparator());
		empSet2.add(new Employee(1, "Ravi"));
		empSet2.add(new Employee(2, "Raj"));
		
		for (Employee employee : empSet2) {
			System.out.println(employee);
			
		}

	}

}
