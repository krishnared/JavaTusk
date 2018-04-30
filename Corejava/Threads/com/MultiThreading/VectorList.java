package com.MultiThreading;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

//	Vector -> Dynamic Array
//  Vector was introduced before collections 
public class VectorList {
	public static void main(String[] args) {

		// Vector
		Vector<Integer> v = new Vector<>(); // Capacity is increased
		v.add(4);
		v.add(7);
		v.add(7);
		v.add(7);
		v.add(7);
		v.add(7);
		v.add(7);
		v.add(7);
		v.add(7);
		v.add(7);
		v.add(7);
		v.add(3,21); //Adding an element in the middle 
		
		System.out.println(v.capacity());
		for (int i : v) {
			System.out.println("The value of index" + i);
		}

		// ArrayList
		ArrayList<Integer> A = new ArrayList<>();
		A.add(2);
		A.add(3);
		System.out.println("Array list size" + A.size());

	}
}

// ----Array list - Vector
// --Memory saver - Memory waster
// Not Threasafe - ThreadSafe
// ---------fast - slow
