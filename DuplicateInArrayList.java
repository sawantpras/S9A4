//a program to print the duplicate values in an array list.

import java.util.*;

public class DuplicateInArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("r");
		list.add("2");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");

		// System.out.println("\nCount 'a' with frequency");
		// System.out.println("a : " + Collections.frequency(list, "a"));

		System.out.println("\n Count all with frequency");
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) {
			// System.out.println(temp + ": " + Collections.frequency(list,
			// temp));
			if (Collections.frequency(list, temp) > 1) {
				System.out.println(" duplicate valures are " + temp + ":"
						+ Collections.frequency(list, temp));
			} else {
				// System.out.println(temp);
			}
		}
	}
}