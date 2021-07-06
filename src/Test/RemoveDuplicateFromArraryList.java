package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArraryList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 7, 8, 9));

		//using LinkedHashSet
		LinkedHashSet<Integer> linkedhashset =  new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> finallist = new ArrayList<Integer>(linkedhashset);
		System.out.println(finallist);
		
		System.out.println("---");
		//Stream- JDK 8
		
		ArrayList<Integer> numbersStream = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 7, 8, 9));
		List<Integer> finallist1 = numbersStream.stream().distinct().collect(Collectors.toList());
		System.out.println(finallist1);
	}

}
