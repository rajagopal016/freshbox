package LambdaExpressions;
import java.util.*;

public class StudentAgeMain {

	public static void main(String[] args) {
		StudentAge s1 = new StudentAge(3);
		StudentAge s2 = new StudentAge(6);
		StudentAge s3 = new StudentAge(9);
		StudentAge s4 = new StudentAge(12);
		StudentAge s5 = new StudentAge(11);
		StudentAge s6 = new StudentAge(20);
		List<StudentAge> ages = Arrays.asList(new StudentAge[] {s1, s2, s3, s4, s5, s6});
		
		List<StudentAge> filtered = StudentPredicates.filterAge(ages, StudentPredicates.filterByAge(5));
		for(StudentAge s : filtered) {
			System.out.println(s.getAge());
		}

	}

}
 