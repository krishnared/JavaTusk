package com.MultiThreading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;

public class AllCollections {
	public static void main(String[] args) throws Exception {

		// Collection Interface
		Collection<String> Cltns = new ArrayList<>();
		//Collections are interfaces. An Interfaces cannot be instantiated, so we use Arraylist class.
		Cltns.add("Hello");
		Cltns.add("Welcome");
		System.out.println("Display the array list of values :" + Cltns);
		// No Index Number & Cannot insert the values in between
		
		Collection Cltnss=new ArrayList<>();
		Cltnss.add(3);
		Cltnss.add("Hello");
		System.out.println(Cltnss);
		
		System.out.println("----END OF COLLECTION INTERFACE-------");

		// List -> Interface
		// ArrayList ->class
		List<String> names = new ArrayList<>();
		// List with ArrayList Declaration
		names.add("Krishna");
		names.add("Krishna");
		names.add("Krishi");
		names.add("Nithish");
		names.add("James");
		names.add("Krishna");
		System.out.println("Array set of values :" + names);
		System.out.println("Array List value " + names.get(3)); // Nithish
		// Fetching 3rd element
		names.remove(3);
		// removing 3rd element
		System.out.println("Array List value after removing 3rd element :" + names.get(3));// James
		names.add(3, "Vasavi"); // Pushing Vasavi to 3rd element again
		System.out.println("Array List value after pushing vasavi to 3rd element :" + names.get(3)); // Vasavi
		// Two Ways to print the total ArrayList
		System.out.println("Array set of values in Array format :" + names); // Array Set of values
		System.out.println("  Names in List order in stream API format ");
		names.forEach(System.out::println);

		for (String i : names) {
			System.out.println(" using for loop           :   " + i);
		}

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println("Using iterator while loop :  " + itr.next());
		}
		Collections.sort(names);
		System.out.println("Sorting using collections.sort " + names);

		//
		List<Book> booklist = new ArrayList<>();

		Book b1 = new Book(102, "Let us b", "bashwanth danethkar", "SPB", 8);
		Book b2 = new Book(102, "Let us b", "bashwanth danethkar", "PSB", 8);
		Book b3 = new Book(103, "Let us c", "cashwanth eanethkar", "BBS", 8);
		Book b4 = new Book(104, "Let us d", "dashwanth wanethkar", "BPd", 8);

		booklist.add(b1);
		booklist.add(b2);
		booklist.add(b3);
		booklist.add(b4);

		for (Book b : booklist) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}

		System.out.println("---------------------------END OF ARRAY LIST------------------------------");

		// LINKED LIST
		// It's a key value pair which is mainly used when to insert a value in betweeen
		// suppose if you take an address book, you have two corresponding values, if
		// one value is deleted
		// then it should not bump up. Thats the reason we use key value paired linked
		// list
		// To access value ... we need to have key
		// LinkedList abstracts AbstractSequentialList
		// LinkedList implements Deque
		// Java LinkedList class can be used as list, stack or queue.
		/*
		 * Differences 1) ArrayList internally uses dynamic array to store the elements.
		 * LinkedList internally uses doubly linked list to store the elements. 2)
		 * Manipulation with ArrayList is slow because it internally uses array. If any
		 * element is removed from the array, all the bits are shifted in memory.
		 * Manipulation with LinkedList is faster than ArrayList because it uses doubly
		 * linked list so no bit shifting is required in memory. 3) ArrayList class can
		 * act as a list only because it implements List only. LinkedList class can act
		 * as a list and queue both because it implements List and Deque interfaces. 4)
		 * ArrayList is better for storing and accessing data. LinkedList is better for
		 * manipulating data.
		 */

		// HASH SET - unique kind of elemenets is called hasing.
		// Hash Set stores the elements by a mechanism called Hashing.

		Set<Integer> setex = new HashSet<>(); // For non duplicate values.
		setex.add(12);
		setex.add(13);
		setex.add(12); // This wont print
		setex.add(12); // This wont print
		System.out.println("Using Stream API");
		setex.forEach(System.out::println);

		// We cannot use Iterator in the Set's

		for (int j : setex) {
			System.out.println("The HashSet values are :  " + j);
		}

		System.out.println("------------------------END OF HASH SET-----------------------------------");
		// TREE SET
		
		Set<Integer> settree = new TreeSet<>();
		settree.add(12);
		settree.add(11);
		settree.add(14);
		settree.add(21);
		settree.forEach(System.out::println); // StreamAPI
		Set<String> settreestring = new TreeSet<>();
		settreestring.add("pmbit");
		settreestring.add("lmbit");
		settreestring.add("Ambit");
		settree.forEach(System.out::println); // StraemAPI

		System.out.println("-------------------------END OF TREE SET-----------------------------------");
		/*
		 * // JAVA QUEUE Queue<Book> queue = new PriorityQueue<Book>(); // Creating
		 * Books Book b12 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		 * Book b22 = new Book(233, "Operating System", "Galvin", "Wiley", 6); Book b32
		 * = new Book(101, "Data Communications & Networking", "Forouzan",
		 * "Mc Graw Hill", 4); // Adding Books to the queue queue.add(b12);
		 * queue.add(b22); queue.add(b32);
		 * System.out.println("Traversing the queue elements:"); for (Book k : queue) {
		 * System.out.println(k.id + " " + k.name + " " + k.author + " " + k.publisher +
		 * " " + k.quantity); } queue.remove(); // FIRST IN FIRST OUT for (Book k :
		 * queue) { System.out.println(k.id + " " + k.name + " " + k.author + " " +
		 * k.publisher + " " + k.quantity); }
		 */
		// JAVA DEQUE - LIFO } -> Last in first out.

		System.out.println("Java error");
		System.out.println("--------------------End of JAVA QUEUE AND DEQUEUE ------------------------------");
		System.out.println("Hash Map ->  HashMap maintains no order");
		Map<Integer, String> maptest = new HashMap<>();
		maptest.put(12, "Jahn");
		maptest.put(13, "Anas");
		maptest.put(55, "Cameo");
		maptest.put(null, "Ind");
		String str = maptest.get(12);
		System.out.println(str);
		System.out.println("KeySet : " + maptest.keySet());
		// Entry is the sub interface of Map.
		// So we will be accessed it by Map.Entry name.
		// It provides methods to get key and value.
		System.out.println("Using Map Entry ");
		for (Map.Entry<Integer, String> m : maptest.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("----------------------------------END OF HASH MAP-----------------------------------");

		// TREEMAP

		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		System.out.println("Tree Map -> Sort the values");
		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("----------------------------------END OF TREE MAP-----------------------------------");
		// A Hashtable is an array of list. Each list is known as a bucket.
		// The position of bucket is identified by calling the hashcode() method. A
		// Hashtable contains values based on the key.
		// It contains only unique elements.
		System.out.println("Hash Table -> Array of list, each list is known as a bucket");
		System.out.println("Hash Table -> Which does not allow duplicate values");
		Hashtable<Integer, String> hastable = new Hashtable<>();
		hastable.put(12, "Anjali");
		hastable.put(13, "Veronica");
		hastable.put(42, "Mark");
		for (Map.Entry<Integer, String> m1 : hastable.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
	}
}

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

}