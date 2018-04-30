package com.MultiThreading;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AddressBookUsingMap {
	public static void main(String[] args) {
		Map<String, String> Phonebook = new HashMap<>();
		Phonebook.put("Krishna", "516434613");
		Phonebook.put("Krish", "9398321311");
		System.out.println();
		/*Set<String> keys = Phonebook.keySet();

		for (String key : keys) {
			System.out.println(key + " " + Phonebook.get(key));
		} */
	}
	}
/*Four Classess to implement Map
1) Hash Map
2) LinkedHashMap
3) Hash Table
4) TreeMap */
 