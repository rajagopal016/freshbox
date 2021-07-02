package LambdaExpressions;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentPredicates {
	static Predicate<StudentAge> filterByAge(int x){
		return a -> a.getAge() > x;
	}
	
	static List<StudentAge> filterAge(List<StudentAge> ages, Predicate<StudentAge> predicate){
		return ages.stream().filter(predicate).collect(Collectors.<StudentAge> toList());
	}

}
