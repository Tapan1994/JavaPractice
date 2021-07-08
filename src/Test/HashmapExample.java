package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapExample {

	public static void main(String[] args) {

		HashMap<String, String> capital = new HashMap<String, String>();

		capital.put("India", "Delhi");
		capital.put("USA", "washington");
		capital.put("UK", "London");
		capital.put("AUS", "melbourne");
		capital.put("USA", "NY");

		// iterator - KeySet
		Iterator<String> it = capital.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = capital.get(key);
			System.out.println("Key:" + key + "----" + "Value:" + value);
		}
		System.out.println("----------------");

		// Iterator - EntrySet
		Iterator<Entry<String, String>> it1 = capital.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("key:" + entry.getKey() + "------" + "value:" + entry.getValue());
		}
		System.out.println("----------------");
		//JDK 8 -  ForEach
		capital.forEach((key, value) -> System.out.println("Key:" + key + "----" + "Value:" + value));
	}

}
