package SetDemo;

import java.util.Comparator;

public class EmpIDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		Integer empID1 = emp1.getId();
		Integer empID2 = emp2.getId();
		
		return empID1.compareTo(empID2);
	}

}
