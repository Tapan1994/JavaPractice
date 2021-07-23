package Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapConcept {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>(Comparator.reverseOrder());

		map.put(2000, "Tapan");
		map.put(700, "Ram");
		map.put(450, "Hari");
		map.put(7000, "Mike");
		map.put(5600, "Krishna");
		System.out.println(map);
		System.out.println("=============");
		map.forEach((k, v) -> System.out.println("key=" + k + "   value=" + v));
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		// key less than 3000
		Set<Integer> lessthan3K = map.headMap(5600).keySet();
		System.out.println(lessthan3K);
		// key greater than 5600
		Set<Integer> greaterthan7K = map.tailMap(5600).keySet();
		System.out.println(greaterthan7K);
	}

}
