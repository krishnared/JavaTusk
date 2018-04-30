package com.MultiThreading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

public class CollectionsAndGenerics {

	public static void main(String[] args) {

		// Normal Array List -> Fixed and Only one type
		int a[] = new int[5];
		a[0] = 3;
		a[1] = 2;
		System.out.println(a[1]);

		// Object array List -> Fixed
		Object Naam[] = new Object[4];
		Naam[1] = "krishna";
		Naam[2] = 2;

		// COLLECTION
		// SET ----- //LIST ----------- //QUEUE
		// HASHSET ------ ArrayList----------Priotiry queue
		// LinkedHashset---Vector------------
		// SerialSet ---------------- Linked List
		// TreeSet----------

		// Collections with Generics(String) ->
		// Not fixed, can shrink.Can have different type of data but no index
		Collection<String> values = new ArrayList<String>();
		values.add("Hari");
		values.add("Krishna");
		System.out.println(values);
		// Collections.sort(list); -> This won't work because we dont have indexes.
		// Cannot Specify Index number
		// Iterator i=(Iterator) values.iterator();
		// System.out.printlna(a);
		// Two ways to fetch the values from collection
		// Iterator
		// Enhanced Forloop
		values.forEach(System.out::println);
		// List -> can have duplicate values
		List<Integer> Names = new ArrayList<Integer>();
		Names.add(131);
		Names.add(3);
		Names.add(12);
		Names.add(431);
		System.out.println(Names);
		Collections.sort(Names);
		System.out.println("After Sorting");
		Names.forEach(System.out::println); // StreamAPI
		System.out.println(Names); //Array type List of values
		
		
		// Set -> cannot have duplicate values
		//Set<Integer> number = new TreeSet<>(); // Sorted Format
		//Set<String> numbers = new HashSet<>(); // Random Format
		//Map<Integer, String> maptest = new HashMap<>(); // Key value session
	}

}
//Collection Names=new ArrayList();
//The Type of collection is object in default
//The Type of collection is String
//<String> is a generic
//We cannot create object for Collection
//Because Collection is an interface
//So we are giving Arraylist
//1.2 -> collections introduced
//1.5 -> Generics introduced



