package com.corejava;
/* In java 8, we have stream API 
 * Stream() */


public class InterfaceJava8 {
	public static void main(String[] args) {
	

	}
}

interface K extends I, J {
	default void publicity() {
		System.out.println("DOuble");
	}

	public default void show() {
		System.out.println("Hello");
		// If we are implementing two interfaces and which have common method.
		// Its programmer responsibility to declare the same method in the C interface
		// also
	}
}

interface I {
	public default void show() {
		System.out.println("Hello world");

	}
}

interface J {
	default void showid() {
		System.out.println("Hello india");
	}

	public default void show() {
		System.out.println("	Hello");
	}
}