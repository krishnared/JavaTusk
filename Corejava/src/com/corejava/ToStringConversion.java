package com.corejava;

import java.util.Scanner;

public class ToStringConversion {
	// In java when you try to call an object, to string method is called
	// Because Class extends object, object returns tostring method
	static int a;
	static int b;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number" + a);

		a = sc.nextInt();
		b = sc.nextInt();
		show();
	}

	static void show() {
		System.out.println("Welcome to Wonderla Mr/Mrs" + a);
		System.out.println("Welcome to Wonderla Mr/Mrs" + b);
	}
}
