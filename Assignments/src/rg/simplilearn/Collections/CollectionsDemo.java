package rg.simplilearn.Collections;
import java.util.ArrayList;
import java.util.List;
public class CollectionsDemo {
	public static void main(String[] args) {
		demoArrayList();
	}
	
	private static void demoArrayList() {
		List<String> myArrayList = new ArrayList<>();
		
		List<Integer> myIntergerArrayList = new ArrayList<>();
		
		myArrayList.add("A");
		myArrayList.add("B");
		myArrayList.add("C");
		
		myIntergerArrayList.add(1);
		System.out.println(myArrayList.size());
		System.out.println(myArrayList.get(0));
		System.out.println(myIntergerArrayList.get(0));
		
	}

}
