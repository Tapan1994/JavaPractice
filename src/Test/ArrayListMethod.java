package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Sachin");
		ar1.add("Virat");
		ar1.add("Galguly");
		ar1.add("Shewag");
		System.out.println(ar1.size());

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Dhoni");
		ar2.add("Ishant");
		// add ar1 with ar1
		ar1.addAll(ar2);
		System.out.println(ar1);
		// add ar2 at particular index
		ar1.addAll(1, ar2);
		System.out.println(ar1);

		ar2.clear();
		System.out.println(ar2);

		ArrayList<String> newarr = (ArrayList<String>) ar1.clone();
		System.out.println(newarr);

		System.err.println(newarr.contains("Sachin"));
		System.out.println(newarr.isEmpty());
		System.out.println(newarr.indexOf("Virat") > 2);
		System.out.println(newarr.lastIndexOf("Ishant"));

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		numbers.removeIf(num -> (num % 2 == 1));
		System.out.println(numbers);

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Tapan", "lisa", "Test", "Tapan"));
		names.retainAll(Collections.singleton("Tapan"));
		System.out.println(names);
		names.add("bisu");
		names.add("manas");
		System.out.println(names);
		//convert arraryList to array
		Object ary[] = names.toArray();
		Arrays.toString(ary);
		for (Object o : ary) {
			System.out.println(o);
		}

	}

}
