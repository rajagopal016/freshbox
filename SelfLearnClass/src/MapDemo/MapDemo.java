package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo {

	private static final int TreeMap = 0;

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "A");
		map.put(5, "B");
		map.put(2, "C");
		
		System.out.println(map);
		
		
		Map<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(1, "A");
		map1.put(5, "B");
		map1.put(2, "C");
		map1.put(0, null);
		System.out.println(map1);
		
		
		System.out.println(map1.get(2));
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		Collection<String> allValues = map.values();
		
		for(String str : allValues) {
			System.out.println(str);
		}
		
		map1.replace(0, "O");
		
		System.out.println(map1);
		map1.replace(0, "O", "Zero");
		System.out.println(map1);
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("Zero"));
		
		
		Set<Map.Entry<Integer, String>> mapEntry = map.entrySet();
		for(Entry<Integer, String> entry:mapEntry)
		{
			Integer key = entry.getKey();
			String value = entry.getValue();
		
		System.out.println(key + ":" + value);
		}
	}
}

