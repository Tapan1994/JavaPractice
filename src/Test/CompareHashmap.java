package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashmap {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(2, "B");
		map2.put(1, "A");
		map2.put(3, "C");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");

		// 1. key-value
		System.out.println(map1.equals(map2));// true
		System.out.println(map1.equals(map3));// false

		// 2. on basis of same key: keySet()
		System.out.println(map1.keySet().equals(map2.keySet()));// true
		System.out.println(map1.keySet().equals(map3.keySet()));// true

		// 3. on basis of extra keys:

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");

		HashSet<Integer> combinekeys = new HashSet<Integer>(map1.keySet());
		combinekeys.addAll(map4.keySet());
		combinekeys.removeAll(map1.keySet());
		System.out.println(combinekeys);

		// 4. on basis of values

		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");

		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map5.put(4, "A");
		map5.put(5, "B");
		map5.put(6, "C");

		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");

		// duplicates are not allowed
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));

		// duplicates are allowed
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
		System.out.println(new HashSet<>(map5.values()).equals(new ArrayList<>(map7.values())));

	}

}
