package ArrayListDemo;
import java.util.*;

public class ArrayListClass {

	public static void Process() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(new String("A")); //boxing
		list.add("B"); //auto boxing
		list.add("C");
		boolean isElementAvailable = list.contains("A");
		System.out.println(isElementAvailable);
		list.set(0, "D");
		list.remove("D");
		list.add(0, "A");
		Iterator itr = list.iterator();
		System.out.println(list.get(0));


		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		ArrayListClass a = new ArrayListClass();
		a.Process();

	}

}
