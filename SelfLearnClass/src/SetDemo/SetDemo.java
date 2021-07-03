package SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(20);
		set.add(20);
		set.add(22);
		set.add(4);
		System.out.println("Hashset " + set);//unordered
		
		set = new LinkedHashSet<Integer>();
		set.add(20);
		set.add(20);
		set.add(22);
		set.add(4);
		System.out.println("LinkedHashSet " + set); //insertion ordered
		set = new TreeSet<Integer>();
		set.add(20);
		set.add(20);
		set.add(22);
		set.add(4);
		set.add(223);
		set.add(43);
		System.out.println("TreeSet " + set); //sorted
		System.out.println(set.contains(20));
		set.remove(20);
		System.out.println("TreeSet " + set); //sorted
		
		for (Integer value : set) {
			System.out.println(value);
		}
		
		/*
		 * Iterator i = set.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */
		
	}

}
