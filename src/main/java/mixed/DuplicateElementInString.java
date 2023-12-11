package mixed;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementInString {

	public static void main(String[] args) {

		String names[] = { "Mehul", "Akshay", "Manish", "Hitesh", "Manish" };

		// 1 Using For Loop
		for (int i = 0; i <= names.length - 1; i++) {
			for (int j = i + 1; j <= names.length - 1; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("Duplicate Element is ::: " + names[i]);
				}

			}
		}
		System.out.println("*********************************");

		// 2 Using HashSet
		Set<String> s = new HashSet<String>();
		for (String name : names) {
			if (s.add(name) == false) {
				System.out.println("Duplicate Element is ::: " + name);
			}
		}

		System.out.println("*********************************");

		// 3 Using HashMap
		Map<String, Integer> m = new HashMap<>();

		for (String name : names) {
			Integer count = m.get(name);

			if (count == null) {
				m.put(name, 1);
			} else
				m.put(name, ++count);
		}

		Set<Map.Entry<String, Integer>> entrySet = m.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {

				System.out.println("Duplicate Element is ::: " + entry.getKey());
			}
		}

	}

}
