package ArrayListDemo;
import java.util.*;

public class ArrayListClass {

	public static void Process() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(new String("A"));
		list.add("B");
		list.add("C");
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
