package Test;

import java.util.ArrayList;

public class ArraryListExample {

	public static void main(String[] args) {

		// 1. default genrics
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(10);
		ar.add("Tapan");
		ar.add(100.12);
		ar.add(12.6f);
		System.out.println(ar);
		System.out.println(ar.size());

		System.out.println(ar.contains("Tapan"));

	}

}
