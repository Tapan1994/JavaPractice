package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class syncArraryListConcept {

	public static void main(String[] args) {
		// synchronizedList with synchronized method
		List<String> ls = Collections.synchronizedList(new ArrayList<String>());
		ls.add("Tom");
		ls.add("jerry");
		ls.add("scooby");
		System.out.println(ls);

		synchronized (ls) {
			Iterator<String> it = ls.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}

		}
		System.out.println("-------");
		// copyOnWriteArraryList

		CopyOnWriteArrayList<String> newlist = new CopyOnWriteArrayList<String>();
		newlist.add("java");
		newlist.add("ruby");
		newlist.add("python");
 
		Iterator<String> itr = newlist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
