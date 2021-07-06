package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author tapnath
 *
 */
public class StudentArraryList {
	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();

		studentList.add("Tapan");
		studentList.add("Nath");
		studentList.add("Kumar");
		studentList.add("Tapu");
		// for loop
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		System.out.println("-----");

		// for each loop
		for (String student : studentList) {
			System.out.println(student);
		}

		System.out.println("-----");

		// JDK 8- Stream with Lambda for each
		studentList.stream().forEach(ele -> System.out.println("ele"));

		System.out.println("-----");

		// Iterator
		Iterator<String> it = studentList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-----");
		//arrayList with other ArraryList
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Test1", "Test2", "Test3"));

		System.out.println(namesList);
		System.out.println(namesList.size());
		Iterator<String> names = namesList.iterator();
		while (names.hasNext()) {
			System.out.println(names.next());

		}
	}
}
