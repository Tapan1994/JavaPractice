package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArraryList {

	public static void main(String[] args) {

		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "C"));
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("Java", "Python", "C++", "Scala"));
		ArrayList<String> arr3 = new ArrayList<String>(Arrays.asList("Java", "Python", "C++", "Scala"));
		// sort & compare

		Collections.sort(arr1);
		Collections.sort(arr2);
		Collections.sort(arr3);
		System.out.println(arr3.equals(arr2));

		System.out.println("--------------");

		// additional elements
		ArrayList<String> arr5 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "C"));
		ArrayList<String> arr6 = new ArrayList<String>(Arrays.asList("Java", "Python", "C++", "Scala"));

		arr5.removeAll(arr6);
		System.out.println(arr5);

		// missing elements

		ArrayList<String> arr7 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "C"));
		ArrayList<String> arr8 = new ArrayList<String>(Arrays.asList("Java", "Python", "C++", "Scala"));
		arr8.removeAll(arr7);
		System.out.println(arr8);
		
		//common elements
		ArrayList<String> arr9 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "C"));
		ArrayList<String> arr10 = new ArrayList<String>(Arrays.asList("Java", "Python", "C++", "Scala"));
		arr9.retainAll(arr10);
		System.out.println(arr9);
		
	}

}
