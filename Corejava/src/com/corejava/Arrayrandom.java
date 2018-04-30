package com.corejava;

import java.util.Random;

public class Arrayrandom {

	public static void main(String[] args) {
		Random r = new Random();
		int a[] = new int[50];
		// number of elements need in the output list
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(50);
			// The max value is 50;
			// i.e: every number should be less than 50
		}
		for (int i : a)
			System.out.println(i);
	}
}
