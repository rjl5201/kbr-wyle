package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class CollectionsChallenge {

	public static void main(String[] args) {

		// Part 1
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++) {
			list.add(i);
		}
		for (int x = 6; x < 16; x++) {
			list2.add(x);
		}
		Collections.shuffle(list); // randomize order
		Collections.shuffle(list2);

		System.out.println("List 1: " + list);
		System.out.println("List 2: " + list2);

		System.out.println("List 1 Size: " + list.size());
		System.out.println("List 2 Size: " + list2.size());

		// Part 2
		TreeSet<Integer> tree = new TreeSet<Integer>(); // remove duplicates and order
		tree.addAll(list);
		tree.addAll(list2);
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(tree);
		System.out.println("Sorted & No Duplicates: " + list3);
		list3.remove(list3.size() / 2);
		System.out.println("Remove Middle Number: " + list3);
		Collections.reverse(list3);
		System.out.println("Reversed: " + list3);
		System.out.println("Size: " + list3.size());

		// Part 3
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		// Chose LinkedHashMap because of its ability to keep the collection ordered by which keys were inserted first
		for (int i = 1; i < 6; i++) {
			map.put("key" + i, "value" + i);
		}

		String duplicateKey = "key3";

		if (map.containsKey(duplicateKey)) {
			System.out.println("Already contains key: " + duplicateKey);
		}

		System.out.println("Key Value Colletion: " + map);
		System.out.println("Collection Size: " + map.size());
	}

}
